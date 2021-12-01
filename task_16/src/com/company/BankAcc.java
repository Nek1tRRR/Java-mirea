package com.company;
import java.util.Scanner;
public class BankAcc extends Person{
    private int money=0;

    public BankAcc(String name) {
        super.name=name;
    }
    public synchronized void add(int sum,int thr) {
        {this.money+=sum;System.out.println("Поток N"+thr+":Успешное пополнение, баланс: "+checkbalance());}
    }
    public synchronized void takeoff(int sum, int thr) {
        if(isenough(sum))
        {money-=sum;System.out.println("Поток N"+thr+":Успешное снятие, баланс: "+checkbalance());}
        else System.out.println("Поток N"+thr+":Недостаточно средств, баланс: "+checkbalance());
    }
    public boolean isenough(int amount) {
        return (money-amount>=0)?true:false;
    }
    public int checkbalance() {
        return money;
    }
}
