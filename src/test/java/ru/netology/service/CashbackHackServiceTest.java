package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    // ниже граничного значения
    public void shouldCountWhenUnderBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    // ниже граничного значения на 1
    public void shouldCountWhenCloseToBoundaryUnder() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    // равно граничному значению
    public void shouldCountWhenBoundary() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    // выше граничного значения на 1
    public void shouldCountWhenCloseToBoundaryBelow() {

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    // выше граничного значения
    public void shouldCountWhenAboveBoundary() {

        int actual = service.remain(1050);
        int expected = 950;

        assertEquals(expected, actual);
    }
}