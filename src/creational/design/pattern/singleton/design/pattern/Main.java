package creational.design.pattern.singleton.design.pattern;

public class Main {

    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        Singleton instanceThree = Singleton.getInstance();
    }
}
