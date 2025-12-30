package simuladorRpg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("App class tests")
class AppTest {

    @Test
    @DisplayName("You must create a Warrior character when selection is 1.")
    void shouldCreateWarrior() {
        // given
        int selectClass = 1;

        // when
        Character character = App.createCharacter(selectClass);

        // then
        assertNotNull(character);
        assertEquals(Character.CharacterClass.WARRIOR, character.getClassType());
    }

    @Test
    @DisplayName("You must create a Wizard character when selection is 2.")
    void shouldCreateWizard() {
        // given
        int selectClass = 2;

        // when
        Character character = App.createCharacter(selectClass);

        // then
        assertNotNull(character);
        assertEquals(Character.CharacterClass.WIZARD, character.getClassType());
    }

    @Test
    @DisplayName("You must create a Rogue character when selection is 3.")
    void shouldCreateRogue() {
        // given
        int selectClass = 3;

        // when
        Character character = App.createCharacter(selectClass);

        // then
        assertNotNull(character);
        assertEquals(Character.CharacterClass.ROGUE, character.getClassType());
    }

    @Test
    @DisplayName("You must create an Archer character when selection is 4.")
    void shouldCreateArcher() {
        // given
        int selectClass = 4;

        // when
        Character character = App.createCharacter(selectClass);

        // then
        assertNotNull(character);
        assertEquals(Character.CharacterClass.ARCHER, character.getClassType());
    }

    @Test
    @DisplayName("Should throw an exception for an invalid class.")
    void shouldThrowExceptionForInvalidClass() {
        // given
        int selectClass = 5;

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            App.createCharacter(selectClass);
        });
    }

    @Test
    @DisplayName("An exception must be thrown for negative class.")
    void shouldThrowExceptionForNegativeClass() {
        // given
        int selectClass = -1;

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            App.createCharacter(selectClass);
        });
    }

    @Test
    @DisplayName("It should return a formatted list of classes.")
    void shouldReturnFormattedClassList() {
        // when
        String classList = App.listClasses();

        // then
        assertNotNull(classList);
        assertTrue(classList.contains("1 - Guerreiro"));
        assertTrue(classList.contains("2 - Mago"));
        assertTrue(classList.contains("3 - Ladino"));
        assertTrue(classList.contains("4 - Arqueiro"));
    }

    @Test
    @DisplayName("The class list must contain a line break.")
    void shouldContainLineBreaksInClassList() {
        // when
        String classList = App.listClasses();
        String[] classes = classList.split("\n");

        // then
        assertEquals(4, classes.length);
    }
}
