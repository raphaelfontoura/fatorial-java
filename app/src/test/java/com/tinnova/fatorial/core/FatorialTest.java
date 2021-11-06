package com.tinnova.fatorial.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FatorialTest {
    @Test
    void getFatorial_shouldReturnFatorial120_whenIntegerValueInformed5() {
        Integer value = 5;
        Integer expectResult = 120;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void getFatorial_shouldReturnFatorial6_whenIntegerValueInformed3() {
        Integer value = 3;
        Integer expectResult = 6;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void getFatorial_shouldReturnFatorial2_whenIntegerValueInformed2() {
        Integer value = 2;
        Integer expectResult = 2;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void getFatorial_shouldReturnFatorial720_whenIntegerValueInformed6() {
        Integer value = 5;
        Integer expectResult = 120;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void getFatorial_shouldReturnFatorialOne_whenIntegerValueInformedEqualsZero() {
        Integer value = 0;
        Integer expectResult = 1;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void getFatorial_shouldReturnFatorialOne_whenIntegerValueInformedEqualsOne() {
        Integer value = 1;
        Integer expectResult = 1;

        Integer result = Fatorial.getFatorial(value);

        Assertions.assertEquals(expectResult, result);
    }
}
