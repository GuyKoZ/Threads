public class Worker implements Runnable {
    public int num,countDiv = 0;
    public static int maxNum = 0;

    public Worker(int num) {// Constructor
        this.setCountDiv(0);
        this.num = num;
    }

    public int getNum() { return num; }

    public void setCountDiv(int countDiv) { this.countDiv = countDiv; }

    public int getMaxNum() { return maxNum; }

    @Override
    public void run() {
        printDivisors();
    }

    private synchronized void printDivisors()//checking all numbers from 1 to the input number
    {
        System.out.println(Thread.currentThread().getName() + " calculate divisors of number " + num);
        for (int i = 1; i <= getNum(); i++) {
            if (num % i == 0) {
                countDiv++;
            }
        }
        System.out.println("Number divisors of " + getNum() + " is " + countDiv);
        this.setCountDiv(countDiv);
    }
}
