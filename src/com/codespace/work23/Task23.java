package com.codespace.work23;

import static java.lang.System.out;

public class Task23 {
    public static void main(String[] args) {
        int var_1 = 3;
        int var_2 = 5;

        out.println("base var_1: " + var_1);
        out.println("base var_2: " + var_2);
        out.println("---------------------");

        var_1 = var_1 + var_2;
        out.println("сумма переменных: " + var_1);
        var_2 = var_1 - var_2;
        out.println("переменная var_2 стала: " + var_2);

        var_1 = var_1 - var_2;
        out.println("переменная var_1 стала: " + var_1);

    }
}
