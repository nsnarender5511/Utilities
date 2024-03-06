package com.narender.MultiThreadingBasics.RaceCondition;

public class Bank implements Runnable {
    private int balance = 100;
    @Override
    public void run() {
        try {
            makeWithdrwal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(balance < 0){
            System.out.println("Money Overdrawn by  " + Thread.currentThread().getName());
        }
    }

    private void makeWithdrwal() throws InterruptedException {
        if(balance > 75){
            System.out.println(Thread.currentThread().getName() +  "  is withdrawing Money !!");
            balance -= 75;
            System.out.println("going to withdraw Balance 75 || New Balance is "+ balance);
            //Thread.sleep(10);
        }else{
            System.out.println("Can't Withdraw !! Low Balance !!  " + balance);
        }
    }
}
