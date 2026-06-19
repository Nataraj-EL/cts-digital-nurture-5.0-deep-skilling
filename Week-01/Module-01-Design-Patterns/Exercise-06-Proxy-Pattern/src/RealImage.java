public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading image from remote server.. " + fileName);

        try {
            Thread.sleep(1000); // just to simulate delay
        } catch (InterruptedException e) {
            System.out.println("Loading interrupted");
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}