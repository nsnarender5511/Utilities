package com.narender.MultiThreadingBasics.ThreadCoopration;

import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable{
    private ObjectOfTasks objectOfTask;

    public Task1(ObjectOfTasks objectOfTask) {
        this.objectOfTask = objectOfTask;
    }

    @Override
    public void run() {
        while(objectOfTask.getValue() >= 0){
            System.out.println("Thread #1 || updating Value  :  "+ objectOfTask.getValue());
            objectOfTask.setValue( objectOfTask.getValue() - 1);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
