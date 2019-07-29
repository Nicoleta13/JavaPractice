package com.nicole;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nonReversed = {1,2,3,4,5,6};
        System.out.println("Array = " + Arrays.toString(nonReversed));
        reverse(nonReversed);
        System.out.println("Reversed array: " + Arrays.toString(nonReversed));
    }

    public static void reverse(int[] array){

        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }
}
