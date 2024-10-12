package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatShouldReturnFoodListTest() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutArgumentsShouldReturn1Test() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithParameterShouldReturnPassedValueAsKittensTest() {
        int actual = feline.getKittens(10);
        int expected = 10;
        assertEquals(expected, actual);
    }
}
