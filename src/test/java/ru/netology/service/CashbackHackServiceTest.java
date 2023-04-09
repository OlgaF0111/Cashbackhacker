package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testRemain123() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void testRemain456() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void testRemain4546() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void testRemain4566() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3750;

        int expected = 250;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
}