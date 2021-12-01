package com.company;

public class ATM implements Runnable {
    private BankAcc acc;
    private boolean op;
    private int thr;int sum;
    ATM(BankAcc acc,boolean op,int thr,int sum) {
        this.acc=acc;this.op=op;this.thr=thr;this.sum=sum;
    }
    @Override
    public synchronized void run() {
        Thread.currentThread().setName("Вход в поток N"+this.thr+"("+(this.op?"пополнение на ":"снятие ")+sum+")");
        System.out.println(Thread.currentThread().getName());
        if (this.op) acc.add(this.sum,this.thr);
        else acc.takeoff(this.sum,this.thr);
    }
}
