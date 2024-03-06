package com.narender.MultiThreadingBasics.ExecuterService;

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
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            /*if(objectOfTask.getValue() == 55){
                Thread.currentThread().interrupt();
            }*/
        }
    }

}
