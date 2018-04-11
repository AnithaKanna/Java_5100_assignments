public class App extends Thread {

        int counter;
        public App(int counter){
            this.counter=counter;
        }
        public void run()
        {
            if(counter<50)
            {
                createThread(counter+1);

            }
            System.out.println("hello" + counter);
        }
        public void createThread(int counter) {
            App t=new App(counter);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        public static void main(String[] arg){
            App t = new App(1);
            t.start();
        }
    }

