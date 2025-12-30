package simuladorRpg;

public class Character {

    public enum CharacterClass {
        WARRIOR(60, 60), WIZARD(70, 50), ROGUE(65, 55), ARCHER(70, 50);

        private int classAttack;
        private int classDefense;

        CharacterClass(int classAttack, int classDefense) {
            this.classAttack = classAttack;
            this.classDefense = classDefense;
        }

        public int getClassAttack() {
            return classAttack;
        }

        public int getClassDefense() {
            return classDefense;
        }
    }
    
    private int life;
    private final int attack;
    private final int defense;
    private final CharacterClass classType;
    private static final int INITIAL_LIFE = 100;

    public Character(CharacterClass CharacterClass) {
        this.life = INITIAL_LIFE;
        this.attack = CharacterClass.getClassAttack();
        this.defense = CharacterClass.getClassDefense();
        this.classType = CharacterClass;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getLife() {
        return life;
    }

    public CharacterClass getClassType() {
        return classType;
    }

    @Override
    public String toString() {
        return "Character{" +
                "attack=" + attack +
                ", life=" + life +
                ", defense=" + defense +
                ", classType=" + classType +
                '}';
    }

    public int attack(Character character) {

        int damage = this.attack - character.getDefense();

        if (damage < 0) {
            damage = 0;
        }
        
        character.receiveDamage(damage);
        return damage;
    }

    public void receiveDamage(int damage) {
        this.life -= damage;
    }

    public boolean alive() {
        return this.life > 0;
    }

}