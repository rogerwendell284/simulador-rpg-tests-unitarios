package simuladorRpg;

import simuladorRpg.Character;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    private Character warrior;
    private Character wizard;
    private Character rogue;
    private Character archer;

    @BeforeEach
    void setUp() {

        warrior = new Character(Character.CharacterClass.WARRIOR);
        wizard = new Character(Character.CharacterClass.WIZARD);
        rogue = new Character(Character.CharacterClass.ROGUE);
        archer = new Character(Character.CharacterClass.ARCHER);

    }

    @Test
    @DisplayName("When the offense is bigger than the defense")
    void shouldDecreaseLifeWhenAttackIsStronger() {
        //given
        wizard.attack(warrior);

        //then
        assertEquals(90, warrior.getLife());

    }

    @Test
    @DisplayName("When an archer attacks a warrior")
    void shouldDecreaseLifeWhenArcherAttacksWarrior() {
        //given
        archer.attack(warrior);

        //then
        assertEquals(90, warrior.getLife());
    }

    @Test
    @DisplayName("When you take damage")
    void shouldTakeDamage() {
        //given
        wizard.receiveDamage(30);

        //then
        assertEquals(70, wizard.getLife());
    }

    @Test
    @DisplayName("When you die")
    void shouldDie() {
        //given
        rogue.receiveDamage(100);

        //then
        assertFalse(rogue.alive());
    }

    @Test
    @DisplayName("When you not die")
    void shouldNotDie() {
        //given
        wizard.receiveDamage(50);

        //then
        assertTrue(wizard.alive());
    }
}
