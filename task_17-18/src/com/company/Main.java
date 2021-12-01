package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) 
    {
        n3 z=new n3();
        System.out.println("--------задание 1--------\nВведенная строка:abcdefghijklmnopqrstuv18340"); 
        System.out.println(z.check(1,"abcdefghijklmnopqrstuv18340"));
        System.out.println("\nВведенная строка:abcdefghijklmnoasdfasdpqrstuv18340");
        System.out.println(z.check(1,"abcdefghijklmnoasdfasdpqrstuv18340"));
        System.out.println("--------задание 2--------\nВведенная строка:aE:dC:cA:56:76:54"); 
        System.out.println(z.check(2,"aE:dC:cA:56:76:54"));
        System.out.println("\nВведенная строка:01:23:45:67:89:Az"); 
        System.out.println(z.check(2,"01:23:45:67:89:Az"));
        System.out.println("--------задание 3--------\nВведенная строка:23.78 USD, 22 UDD, 0.002 USD,22.22 RU, 33.33 EU");
        z.ceni("23.78 USD, 22 UDD, 0.002 USD, 22.22 RU, 33.33 EU");
    }
}
