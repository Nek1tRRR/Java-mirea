package com.company;

import java.util.Scanner;

enum leggs{RIGHT,LEFT};
public class Main{

    public static void main(String[] args) {
    Robot r=new Robot(leggs.RIGHT);
    Robot l=new Robot(leggs.LEFT);
    int i;
    Scanner scanner=new Scanner(System.in);
    System.out.println("1 - сделать шаг,0 - завершение программы");
    
    while((i=scanner.nextInt())!=0) {
        if (i==1) {r.run();l.run();}
        System.out.println("1 - сделать шаг,0 - завершение программы");
        }
    }
}
