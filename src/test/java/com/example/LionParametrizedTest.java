package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    Feline feline = Mockito.mock(Feline.class);
    private final String sex;
    private final List<String> foodList;
    private final boolean hasManeExpected;
    Lion lion;

    public LionParametrizedTest(String sex, List<String> foodList,  boolean hasManeExpected) {
        this.sex = sex;
        this.foodList = foodList;
        this.hasManeExpected = hasManeExpected;
    }

    @Before
    public void setUp() throws Exception {
        lion = new Lion(feline, sex);
    }

    @Parameterized.Parameters
    public static Object[][] getParams() {
        return new Object[][]{
                {"Самец", List.of("Животные", "Птицы", "Рыба"), true},
                {"Самка", List.of("Животные", "Птицы", "Рыба"), false}
        };
    }

    @Test
    public void shouldCreateLionObjectWithMaleOrFemaleSexValueTest() {
        assertNotNull(lion);
    }

    @Test
    public void doesHaveManeShouldCorrespondSexValueTest() {
        boolean actual = lion.doesHaveMane();
        assertEquals(hasManeExpected, actual);
    }

    @Test
    public void shouldReturn1KittenValueWithMaleOrFemaleSexValueTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodShouldReturnFoodListTest() throws Exception {
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(foodList);
        List<String> actualList = lion.getFood();
        assertEquals(foodList, actualList);
    }

    @Test
    public void testEatMeatShouldReturnFoodList() throws Exception {
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(foodList);
        List<String> actual = lion.getFood();
        assertEquals(foodList, actual);
    }
}
