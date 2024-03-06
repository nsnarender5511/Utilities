package com.narender.MultiThreadingBasics.MutualExclssusion;

public class VolatileDemo implements Runnable {
    private volatile Boolean stop = false;

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    public void run(){
        int i = 0;
        while(!stop){
            System.out.println("Running it ......  " + i++);
        }
    }
}
