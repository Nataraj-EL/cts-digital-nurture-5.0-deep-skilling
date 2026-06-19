public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        // Lazy initialization (create only when needed)
        if (realImage == null) {
            realImage = new RealImage(fileName);
        } else {
            System.out.println("Using cached image");
        }

        realImage.display();
    }
}