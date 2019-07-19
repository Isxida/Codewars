package com.isxida.codewars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SquareSum {

    public int metodo1(int[] aInt){
        int result = 0;
        for (int u = 0; u < aInt.length; u++) {
            result +=  aInt[u] * aInt[u];
        }
        return result;
    }
}
