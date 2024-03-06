package com.narender.MultiThreadingBasics.ThreadCoopration;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable{
    private ObjectOfTasks objectOfTask;

    public Task2(ObjectOfTasks objectOfTask) {
        this.objectOfTask = objectOfTask;
    }

    @Override
    public void run() {
        while(objectOfTask.getValue() > 0){
            if(objectOfTask.getValue() < 50){
                objectOfTask.setValue(objectOfTask.getValue() - 1);
                System.out.println("Thread #2 || updating Value  :  "+ objectOfTask.getValue());

            }
            else{
                System.out.println("Thread #2 || Waiting.......  :  "+ objectOfTask.getValue());
            }
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
