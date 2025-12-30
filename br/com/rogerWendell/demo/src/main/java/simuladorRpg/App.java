package simuladorRpg;

import java.util.Random;
import java.util.Scanner;

public class App {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=====Simulador RPG=====");
        System.out.println("Selecione o número correspondente a sua classe: ");
        System.out.println(listClasses());

        var selectClass = scan.nextInt();
        scan.nextLine();

        System.out.println("Selecione o número correspondente a classe contra qual deseja lutar: ");
        System.out.println(listClasses());

        var selectClass2 = scan.nextInt();
        scan.nextLine();

        fight(createCharacter(selectClass), createCharacter(selectClass2));

    }

    public static Character createCharacter(int selectClass) {

        return switch (selectClass) {

            case 1 -> new Character(Character.CharacterClass.WARRIOR);
            case 2 -> new Character(Character.CharacterClass.WIZARD);
            case 3 -> new Character(Character.CharacterClass.ROGUE);
            case 4 -> new Character(Character.CharacterClass.ARCHER);
            default -> throw new IllegalArgumentException("Classe inválida!");

        };

    }

    private static void fight(Character lutador1, Character lutador2) {

        if (lutador1 == null || lutador2 == null) {
            throw new IllegalArgumentException("Personagem inválido!");
        }

        Random sorteio = new Random();
        
        // Make a copy for the fight to not mess with the original objects if needed elsewhere
        Character combatente1 = new Character(lutador1.getClassType());
        Character combatente2 = new Character(lutador2.getClassType());

        Character atacante, defensor;

        while (combatente1.alive() && combatente2.alive()) {

            if (sorteio.nextBoolean()) {
                atacante = combatente1;
                defensor = combatente2;
            } else {
                atacante = combatente2;
                defensor = combatente1;
            }

            int damage = atacante.attack(defensor);

            if (damage == 0) {
                 System.out.printf("A defesa de %s é mais forte que o ataque de %s. Dano causado: %d%n", defensor.getClassType(), atacante.getClassType(), damage);
            } else {
                System.out.printf("O %s recebeu %d de dano. Vida restante: %d%n", defensor.getClassType(), damage, defensor.getLife());
            }

            if (!defensor.alive()) {
                System.out.printf("O %s foi derrotado!%n", defensor.getClassType());
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

        if (combatente1.alive()) {
            System.out.println("Parabéns, você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }

    public static String listClasses() {
        return "1 - Guerreiro\n" + "2 - Mago\n" + "3 - Ladino\n" + "4 - Arqueiro";
    }
}
