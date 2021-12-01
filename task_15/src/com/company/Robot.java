package com.company;
import java.util.Scanner;
public class Robot extends Thread{
    leggs l;
    Robot(leggs leg) {this.l=leg;}
    @Override
    synchronized public void run() {
        System.out.println(l);
    }
}
