public class Main {
    public static void main(String[] args) {
        CountTo1000000Thread countTo1000000Thread = new CountTo1000000Thread("First Thread");
        countTo1000000Thread.start();
        CountTo1000000Thread countTo1000000Thread1 = new CountTo1000000Thread("Second Thread");
        countTo1000000Thread1.start();
        CountTo1000000Thread countTo1000000Thread2 = new CountTo1000000Thread("Third Thread");
        countTo1000000Thread2.start();



    }

//    public static void countTo1000() {
//        for (int i = 0; i < 1000; i++) {
//            System.err.println(i);
//        }
//
//    }
}

    class CountTo1000000Thread extends Thread {

    CountTo1000000Thread(String name) {
        super(name);
    }

        @Override
        public void run() {
            while (true) {
                System.out.println(getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

