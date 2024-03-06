package com.narender.MultiThreadingBasics.ExecuterService;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable{
    private ObjectOfTasks objectOfTask;

    public Task2(ObjectOfTasks objectOfTask) {
        this.objectOfTask = objectOfTask;
    }

    @Override
    public void run() {
        int i = 0;
        while(objectOfTask.getValue() > 0){
            if(objectOfTask.getValue() < 50){
                objectOfTask.setValue(objectOfTask.getValue() - 1);
                System.out.println("Thread #2 || updating Value  :  "+ objectOfTask.getValue());

            }
            else{
                System.out.println("Thread #2 || Waiting.......  :  "+ objectOfTask.getValue());
            }
            try {
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            /*if(i++ > 50){
                Thread.currentThread().interrupt();
            }*/

        }
    }
}
