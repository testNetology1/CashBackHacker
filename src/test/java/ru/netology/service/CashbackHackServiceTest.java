package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateServiceInTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }
    @Test
    public void calculateServiceNotInTheBoundary () {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        System.out.println(actual);
        assertEquals(actual,expected);
    }
    @Test
    public void calculateServiceInTheGradle () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}