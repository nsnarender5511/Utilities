import com.narender.MultiThreadingBasics.MutualExclssusion.Bank;

public class SyncronizationTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        //System.out.println("Hello world!");
        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);
        Thread t3 = new Thread(bank);

        t1.setName("Narender");
        t2.setName("Shakti");
        t3.setName("Fraudster");

        t2.start();
        t1.start();
        t3.start();
    }


}