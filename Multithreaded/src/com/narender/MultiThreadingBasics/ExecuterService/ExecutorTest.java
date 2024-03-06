package com.narender.MultiThreadingBasics.ExecuterService;


import java.util.concurrent.*;

public class ExecutorTest {


    public static void main(String[] args){
        Executor executor1 = Executors.newFixedThreadPool(4);
        Executor e2 = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());;

        ObjectOfTasks obj = new ObjectOfTasks();
        Task1 task1 = new Task1(obj);
        Task2 task2 = new Task2(obj);
        //Try Changing i=1
        int i = 3;
        while(i!=0){
//            executor1.execute(task1);
//            e2.execute(task2);
//
//
//            executor1.execute(task2);
//            e2.execute(task1);


            executor1.execute(task1);
            e2.execute(task2);
            System.out.println("--------------------------------------------------");
            i--;
        }
    }






}
