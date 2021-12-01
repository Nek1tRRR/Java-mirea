package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n3 {
    n3(){}
    public boolean check(int n,String s) 
    {
        switch (n)
        {
            case 1:{return s.matches(("abcdefghijklmnopqrstuv18340"));}
            case 2: {return s.matches(("(?<![:-])\\b(?:[0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}\\b(?![:-])"));}
            case 3: {Pattern p = Pattern.compile("\\d\\d.\\d\\d( USD| RU| EU)");Matcher m =p.matcher(s);return m.matches();}
            default:return false;
        }
    }
    public void ceni(String s) 
    {
        System.out.println("Результат поиска: ");
        String[]sort=s.split(", ");int k=0;
        for (int i = 0; i < sort.length; i++) if (check(3,sort[i])) {System.out.println(sort[i]);k++;}
        if (k==0) System.out.print("ничего нет");
    }

}
