public class Root {
        public static void main(String[] args) {
            Device device = new Device();
            Sensor heat = new Sensor(device);
            Sensor pressure = new Sensor(device);
            Controller controller = new Controller(device,heat,pressure);
            controller.start();
            heat.start();
            pressure.start();

        }
    }
    class Controller extends Thread {
        Device device;
        Sensor heat;
        Sensor pressure;
        public Controller(Device device, Sensor heat, Sensor pressure) {
            this.device = device;
            this.heat = heat;
            this.pressure = pressure;
        }
        public void run() {
            device.startup();
            System.out.println("heat->"+heat.getValue() + "pressure->"+pressure.getValue());

            synchronized (device) {
                System.out.println("heat->"+heat.getValue() + "pressure->"+pressure.getValue());

                if (heat.getValue()>70 || pressure.getValue()>100 ){
                    device.shutdown();}

                try {

                    device.wait();

                }
                catch (InterruptedException e)
                {

                }
            }
            }

        }

    class Sensor extends Thread {
    private final Device device;
        private double value=0;

        public Sensor(Device device) {
            this.device=device;
        }
        public double getValue() {

            return value;
        }
        public void updateValue() {
            this.value+=0.001;

        }
        public void run() {
            //System.out.println(Thread.currentThread().getName());
            while (true) {
            synchronized (device) {
                double oldValue = value;
                updateValue();

                if (value != oldValue) {
                    device.notify(); }
            } }
        } }
    class Device {
        public void startup() {
            System.out.println("The device is starting...");
        }
        public void shutdown() {
            System.out.println("The device is shutting down and exiting..");
        }
    }

