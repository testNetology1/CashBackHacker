package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateServiceInTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
    @Test
    public void calculateServiceNotInTheBoundary () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        System.out.println(actual);
        assertEquals(expected,actual);
    }
    @Test
    public void calculateServiceInTheGradle () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
}