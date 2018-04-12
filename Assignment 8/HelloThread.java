public class HelloThread extends Thread {
    private int counter;
    public HelloThread(int counter)
    {
        super("Thread" + counter);
        this.counter = counter;
    }

    public void run()
    {
        counter++ ;
        if(counter <= 51)
        {
            HelloThread thr = new HelloThread(counter);
            thr.start();
            try {
                thr.join();
                System.out.println("Hello from "+ getName());
            }
            catch (Exception e)
            {

            }
        }
    }

    public static void main (String args[])
    {
        HelloThread th1 = new HelloThread(1);
        th1.start();
    }

}
