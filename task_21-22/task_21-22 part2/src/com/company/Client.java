package com.company;
import java.util.Scanner;
public class Client{
    Client(){}
    public void Sit() 
    {
    ChairFactory newChair=new ChairFactory();
    int flag=1;
    while (flag>0)
    {
    System.out.print("1 - Викторианский стул\n2 - Многофункциональный стул\n3 - Магический стул\n0 - Выход\n" );
    switch(new Scanner(System.in).nextInt()) 
    {
        case 0: 
        {
            flag=0;break;
        }
        case 1: 
        {
            newChair.createVict();
            break;
        }
        case 2: 
        {
            newChair.createMult();
            break;
        }
        case 3: 
        {
            newChair.createMag();
            break;
        }
        default: 
        {
            flag = 1;
            System.out.println("Неверный код действия");
        }
    }
    }
    }
}
