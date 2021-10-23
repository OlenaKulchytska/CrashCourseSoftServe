package task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @ParameterizedTest
    @DisplayName("Shouldn't set so big age")
    @ValueSource(ints = {0, 3, 40, Integer.MAX_VALUE})
    void testIllegalAge(int expectedAge) {
        assertThrows(IllegalArgumentException.class, () -> new Dog("Alex", expectedAge));
    }

    @ParameterizedTest
    @DisplayName("Should set a right color")
    @ValueSource(strings = {"Graph", "Tuzic", "Pushok"})
    void testSameName(String expectedname) {
        Dog dog1 = new Dog(expectedname);
        Dog dog2 = new Dog(expectedname);
        assertTrue(dog1.sameName(dog2));
    }

    @Nested
    @DisplayName("When a dog has been added")
    class WhenDogEdded {
        private final Dog dog = new Dog("Carl", "Terrier", 12);

        @Nested
        @DisplayName("Should allow")
        class ShouldAllow {
            @Test
            @DisplayName("seeing the age of dog")
            void seeingTheNumberOfSides() {
                assertEquals(12, dog.getAge());
            }

            @Test
            @DisplayName("seeing the breed")
            void seeingTheDescription() {
                assertEquals("Terrier", dog.getBreed());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldNot {
            @Test
            @DisplayName("be equal to another dog with the same name")
            void beEqualToAnotherShapeWithTheSameNumberOfSides() {
                assertNotEquals(new Dog("Carl"), dog);
            }
        }
    }
}