
public class MyThreads {

    public static void main(String[] args) {
        
            new Thread(NumInc(), "Thread-1").start();
            new Thread(NumDec(), "Thread-2").start();
            new Thread(CharInc(), "Thread-3").start();
            new Thread(CharDec(), "Thread-4").start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public static Runnable NumInc() {
        return () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
    }

    public static Runnable NumDec() {
        return () -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
    }

    public static Runnable CharInc() {
        return () -> {
            for (int i = 97; i <= 107; i++) {
                System.out.println(Thread.currentThread().getName() + " " + (char)i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
    }

        public static Runnable CharDec() {
            return () -> {
                for (int i = 107; i >= 97; i--) {
                    System.out.println(Thread.currentThread().getName() + " " + (char)i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
    
    }
}