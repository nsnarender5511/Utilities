import com.narender.MultiThreadingBasics.RaceCondition.Bank;

public class RaceConditionTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        //System.out.println("Hello world!");
        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);

        t1.setName("Narender");
        t2.setName("Shakti");

        t1.start();
        t2.start();
    }


}