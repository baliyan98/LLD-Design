package creational.design.pattern.singleton.design.pattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    };
    // This class is not thread safe , we can still make it thread safe

    // if it is synchronised it will put lock everytime

    // go with double locking to kill this overhead;

    synchronized public static Singleton getInstance() {
        if (instance == null) {
            // double locking
            synchronized (Singleton.class) {
                // to check if some other create the object
                if (instance == null) {
                    instance = new Singleton();
                    System.out.println("Creating Instance");
                }

            }

        } else {
            System.out.println("returning already created instance");
        }
        return instance;
    }
}
