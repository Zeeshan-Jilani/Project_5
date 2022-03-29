package com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenation {
    public static void main(String[] args) throws IOException {

        String sen1, sen2,join;
        boolean check;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first sentence:- ");
        sen1 = br.readLine();
        System.out.println("Enter second sentence:- ");
        sen2 = br.readLine();

        join = sen1.concat(" " + sen2);
        System.out.println("\nThe concatenated sentence is: " + join);

        check = sen1.equals(sen2);
        System.out.println("Comparing: " + check);
        if (check){
            System.out.println("The strings Match!");
        }
        else {
            System.out.println("The strings are alternating!");
        }
    }
}
