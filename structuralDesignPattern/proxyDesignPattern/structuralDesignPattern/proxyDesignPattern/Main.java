package structuralDesignPattern.proxyDesignPattern;

public class Main {

    public static void main(String[] args) {
        ImageProcessing image = new RealImageProxy("Image 1");
        System.out.println("Loading Image first time");
        image.process();
        System.out.println("Displaying Image again");
        // this time it will not load the image from disk , it will directly call the
        // process method
        image.process();
    }

}
