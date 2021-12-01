package com.company;
import java.util.Random;
public class Number {
    Number(){}
    public String generate() {
        int x=(int)(new Random()).nextInt(9);
        String str="";
        str+=(char)((new Random()).nextInt(90-65)+65);
        for (int i=0;i<3;i++)
            str+=x;
        for (int i=0;i<2;i++)
            str+=(char)((new Random()).nextInt(90-65)+65);
        for (int i=0;i<2;i++)
        {x=(int)(new Random()).nextInt(9); str+=x;}
        return str;
    }
}
