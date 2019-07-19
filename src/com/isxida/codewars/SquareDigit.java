package com.isxida.codewars;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        String rStr = "";
        String[] arrayS = String.valueOf(n).split("(?!^)");

        for (int i = 0; i < arrayS.length; i++) {
                int a = Integer.parseInt(arrayS[i]);
                int j = a * a;
                rStr = rStr + String.valueOf(j);
        }
        return Integer.parseInt(rStr);
    }

    public int squareDigits_attempt2(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

}