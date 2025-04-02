package org.example.git_test3;

import java.util.Arrays;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] createArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; ++i) {
            a[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 4, 8, 2, 6, 10, 3, 1, 7, 9, 5 };
        Sort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}