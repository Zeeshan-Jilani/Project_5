package com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {

        String sen1,sen2 = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence/word to be checked: ");
        sen1 = br.readLine();
        int length = sen1.length();
        for (int i = length - 1; i >= 0; i--){
            sen2 += sen1.charAt(i);
        }
        if (sen1.equals(sen2)){
            System.out.println("String is a palindrome!");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}
