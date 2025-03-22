package singleton.design.pattern;

public class Singleton {
    private static Singleton instance;

    private Singleton(){};
    // This class is not thread safe , we can still make it thread safe

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("Creating Instance");
        }
        else {
            System.out.println("returning already created instance");
        }
        return instance;
    }
}
