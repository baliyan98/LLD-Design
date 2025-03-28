package structuralDesignPattern.proxyDesignPattern;

public class RealImageProxy implements ImageProcessing {
    RealImage realImage;
    String fileName;

    public RealImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void process() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.process();
    }
}
