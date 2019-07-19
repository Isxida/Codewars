package com.isxida.codewars;

public class Main {

    public static void main(String[] args) {
        // First Kata
        SquareDigit sd = new SquareDigit();
        sd.squareDigits(2020);
        System.out.println("Intento 2 : " + sd.squareDigits_attempt2(345));

        // Second Kata
        PerfectSquare ps = new PerfectSquare();
        System.out.println(ps.findNextSquare(144));

        //Third Kata
        SquareSum ss = new SquareSum();
        System.out.println("Square sum " + ss.metodo1(new int[] {1,2,2}));
        System.out.println("Square sum " + ss.metodo1(new int[] {5,-3,4}));

    }

}
