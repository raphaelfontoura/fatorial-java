package com.tinnova.fatorial.core;

public class Fatorial {
    public static Integer getFatorial(Integer value) {
        if (value == 0) {
            return 1;
        }

        int result = value;
        for (int i = value; i > 1; i--) {
            result *= i-1;
        }
        return  result;
    }

}
