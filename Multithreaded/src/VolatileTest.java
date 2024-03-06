import com.narender.MultiThreadingBasics.MutualExclssusion.VolatileDemo;

import java.util.concurrent.TimeUnit;

public class VolatileTest {
    public static void main(String[] args) throws InterruptedException {

        VolatileDemo task = new VolatileDemo();

        Thread t1 = new Thread(task);

        t1.start();
        TimeUnit.MILLISECONDS.sleep(20);
        task.setStop(true);

    }


}