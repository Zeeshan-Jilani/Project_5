package com.company.Main;

public class FillingArray {
    public static void main(String[] args) {

        int elements[] = new int[10];

        for (int i = 0; i < elements.length; i++){
            elements[i] = elements.length - 1 - i;
        }
        for (int x:elements){
            System.out.println("Array[" + x + "] = " + elements[x]);
        }
    }
}
