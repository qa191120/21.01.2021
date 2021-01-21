package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)  {
        Scanner         s             = new Scanner(System.in);
        Random           r             = new Random();
        //<class-name>   instance-name = new <class-name>();
        //Scanner         s1 = null; // class without new
        Laptop macBook = new Laptop();
        macBook.color = "White";
        macBook.size = 15.4f;
        macBook.chargerType = "Type c";
        macBook.comfKeyboard1_10 = 10;
        System.out.println(macBook.size);
        System.out.println(macBook.color);
        System.out.println(macBook.chargerType);
        System.out.println(macBook.comfKeyboard1_10);
        macBook.turnOn();
        macBook.turnOff();

        Laptop lenovo = new Laptop();
        lenovo.color = "Black";
        lenovo.size = 17.1f;
        lenovo.chargerType = "Type b";
        lenovo.comfKeyboard1_10 = 8;
        System.out.println(lenovo.size);
        System.out.println(lenovo.color);
        System.out.println(lenovo.chargerType);
        System.out.println(lenovo.comfKeyboard1_10);
        lenovo.turnOn();
        lenovo.turnOff();
    }
}
