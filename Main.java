package com.project;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);


    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];

        for( int i = 0 ; i < count ; i++ ){
            System.out.println("Enter a number");
            int number  = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin( int[] array){
        int min = Integer.MAX_VALUE;
        for(i = 0 ; i< array.length ; i++){
            int value = array[i];

            if(min> value){
                min = value;
            }

        }
        return min;
    }

}