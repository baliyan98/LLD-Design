package structuralDesignPattern.proxyDesignPattern;

public class RealImage implements ImageProcessing {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Load image from disk");
    }

    @Override
    public void process() {
        System.out.println("Processing file " + fileName);
    }

}
