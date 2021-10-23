package task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectricKettleTest {

    @Test
    @DisplayName("Should turn on the kettle")
    public void turnOn() {
        ElectricKettle kettle1 = new ElectricKettle();
        assertEquals(true,kettle1.turnOn());

    }

    @Test
    @DisplayName("Should turn off the kettle")
    public void turnOff() {
        ElectricKettle kettle1 = new ElectricKettle();
        assertEquals(false,kettle1.turnOff());

    }

    @ParameterizedTest
    @DisplayName("Should create a new kettle")
    @ValueSource(ints = {3, 4, 5, 6, 7,Integer.MAX_VALUE})
    public void addNewKettle(int expectedId) {
        ElectricKettle kettle = new ElectricKettle(expectedId);
        assertEquals(expectedId, kettle.getId());
    }

    @ParameterizedTest
    @DisplayName("Should set a right color")
    @ValueSource(strings = {"grey", "red", "blue", "green"})
    public void setAndGetColorKettle(String expectedColor) {
        ElectricKettle kettle = new ElectricKettle();
        kettle.setColor(expectedColor);
        assertEquals(expectedColor,
                kettle.getColor());

    }



}