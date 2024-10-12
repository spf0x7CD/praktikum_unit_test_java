package com.example;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void shouldThrowExceptionWithNotMaleOrFemaleSexValueTest() {
        assertThrows(Exception.class, () -> new Lion(feline, "AH-50"));
    }
}