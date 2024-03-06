import com.narender.MultiThreadingBasics.MutualExclssusion.VolatileDemo;
import com.narender.MultiThreadingBasics.ThreadCoopration.ObjectOfTasks;
import com.narender.MultiThreadingBasics.ThreadCoopration.Task1;
import com.narender.MultiThreadingBasics.ThreadCoopration.Task2;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class NaiveWayOfCooperation {


    public static void main(String[] args) throws InterruptedException {

        ObjectOfTasks obj = new ObjectOfTasks();
        Task1 task1 = new Task1(obj);
        Task2 task2 = new Task2(obj);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();


    }
}
