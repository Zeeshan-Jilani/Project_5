package com.company.Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Max_Min {
    public static void main(String[] args) {

        Random rand = new Random();
        int elements[] = new int[10];

        System.out.println("Ten Random numbers:- ");

        for (int i = 0; i < elements.length; i++){
            elements[i] = Math.round((rand.nextInt(100)+1));
            System.out.print(elements[i] + " ");
        }
        Arrays.sort(elements);
        System.out.println("\nMinimum = " + elements[0]);
        System.out.println("Maximum = " + elements[elements.length - 1]);
    }
}
