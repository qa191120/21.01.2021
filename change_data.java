package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    static Scanner s = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args)  {

        int[] arr = { 1,2,3,4};
        System.out.println(arr[0]);
        zeroTheArray(arr);
        System.out.println(arr[0]); // changed to zero

        int x = 3;
        willItChange(x);
        System.out.println(x); // 3
    }

    private static void willItChange(int x) {
        x++;
    }
    private static boolean zeroTheArray(int[] arr)
    {
        for (int index = 0; index < arr.length; index++)
        {
            arr[index] = 0;
        }
    }
}
