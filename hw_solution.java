package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    static Scanner s = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args)  {
        String fname = getStringFromUser("Please enter your first name:");
        String lname = getStringFromUser("Please enter your last name:");

        int[] arr = { 1,2,3,4};
        System.out.println(isLonger(arr , 4));

        System.out.println(isNumberInsideArray(arr, 5));
    }

    private static boolean isNumberInsideArray(int[] arr, int number)
    {
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] == number) {
                return true;
            }
        }
        return false;
    }

    private static String getStringFromUser(String msg) {
        System.out.println(msg);
        String result = s.nextLine();
        return result;
    }

    private static int howManyDigits(int number) {
        String number_as_string = String.valueOf(number);
        return number_as_string.length();
    }

    private static boolean isLonger(int[] numbers, int len) {
        return numbers.length > len;
    }

    private static boolean arrayEqual(int[] numbers1, int[] numbers2) {
        if (numbers1.length != numbers2.length) {
            return false;
        }
        for (int index = 0; index < numbers1.length; index++) {
            if (numbers1[index] != numbers2[index]) {
                return false;
            }
        }
        return true;
    }
}
