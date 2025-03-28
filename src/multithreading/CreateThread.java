package multithreading;

public class CreateThread {
    public static void main(String[] args) {
        // below one is how we created in older version
        // create a thread
        // Thread thread = new Thread();
        // // start the thread
        // thread.start();

        // below is how we can create in functional; programming
        // below I have provided the implementation of run method while creating the
        // thread object
        Thread thread = new Thread(() -> {
            System.out.println("Running the thread ");
        });
        thread.start();

        // creating thread with runnable interface
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Running another thread");
            }
        };
        Thread thread2 = new Thread(runnable, "Thread created via runnable");
        thread2.start();

        // creating thread with runnable interface with lamda expression
        Runnable runnable1 = () -> {
            System.out.println("Running another thread with lambda expression");
        };
        Thread thread3 = new Thread(runnable1, "Thread created via runnable via lambda");
        thread3.start();
    }
}
