package ru.netology.service;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    // Тесты с использованием API JUnit4
    @org.junit.Test
    // ниже граничного значения
    public void shouldCountWhenUnderBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    // ниже граничного значения на 1
    public void shouldCountWhenCloseToBoundaryUnder() {

        int actual = service.remain(999);
        int expected = 1;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    // равно граничному значению
    public void shouldCountWhenBoundary() {

        int actual = service.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    // выше граничного значения на 1
    public void shouldCountWhenCloseToBoundaryBelow() {

        int actual = service.remain(1001);
        int expected = 999;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    // выше граничного значения
    public void shouldCountWhenAboveBoundary() {

        int actual = service.remain(1050);
        int expected = 950;

        org.junit.Assert.assertEquals(expected, actual);
    }

    // Тесты с использованием API JUnit Jupiter
    @org.junit.jupiter.api.Test
    // ниже граничного значения
    public void shouldCountWhenUnderBoundaryJupiter() {

        int actual = service.remain(900);
        int expected = 100;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    // ниже граничного значения на 1
    public void shouldCountWhenCloseToBoundaryUnderJupiter() {

        int actual = service.remain(999);
        int expected = 1;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    // равно граничному значению
    public void shouldCountWhenBoundaryJupiter() {

        int actual = service.remain(1000);
        int expected = 0;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    // выше граничного значения на 1
    public void shouldCountWhenCloseToBoundaryBelowJupiter() {

        int actual = service.remain(1001);
        int expected = 999;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    // выше граничного значения
    public void shouldCountWhenAboveBoundaryJupiter() {

        int actual = service.remain(1050);
        int expected = 950;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}