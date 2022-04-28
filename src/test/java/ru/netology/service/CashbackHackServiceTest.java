package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
        // ниже граничного значения
    void shouldCountWhenUnderBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
        // ниже граничного значения на 1
    void shouldCountWhenCloseToBoundaryUnder() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
        // равно граничному значению
    void shouldCountWhenBoundary() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
        // выше граничного значения на 1
    void shouldCountWhenCloseToBoundaryBelow() {

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
        // выше граничного значения
    void shouldCountWhenAboveBoundary() {

        int actual = service.remain(1050);
        int expected = 950;

        assertEquals(actual, expected);
    }
}
