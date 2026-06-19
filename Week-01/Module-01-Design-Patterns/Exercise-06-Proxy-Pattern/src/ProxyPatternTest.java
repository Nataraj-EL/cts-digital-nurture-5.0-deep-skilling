public class ProxyPatternTest {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");

        System.out.println("\nFirst call:");
        image1.display();

        System.out.println("\nSecond call:");
        image1.display();

        System.out.println("\nThird call:");
        image1.display();
    }
}