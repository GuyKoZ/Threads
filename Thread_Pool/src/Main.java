import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = input.nextInt();
        Worker[] tasks = new Worker[num];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new Worker(i + 1);
        }
        ExecutorService ex = Executors.newFixedThreadPool(5);//create Threads
        for (int i = 0; i < tasks.length; i++) {
            ex.execute(tasks[i]);
        }
        ex.shutdown();
        try {
            ex.awaitTermination(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
