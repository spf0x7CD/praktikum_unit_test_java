package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LionTest {
    Feline feline = Mockito.mock(Feline.class); // Через аннотацию @Mock падает тест shouldReturn1KittenValueTest() c NPЕ, если есть объяснение буду рад услышать
    @Test
    public void shouldThrowExceptionWithNotMaleOrFemaleSexValueTest() {
        assertThrows(Exception.class, () -> new Lion(feline, Mockito.anyString()));
    }
}