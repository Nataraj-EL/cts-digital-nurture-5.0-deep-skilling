public class SingletonPatternTest {

    public static void main(String[] args) {

        Logger firstLogger = Logger.getInstance();

        firstLogger.log("Application started..");

        Logger secondLogger = Logger.getInstance();

        secondLogger.log("User logged in");

        if (firstLogger == secondLogger) {

            System.out.println("\nBoth objects refer to the same instance");
            System.out.println("Singleton Pattern is implemented successfully");

        } else {

            System.out.println("\nDifferent Logger instances exist");
        }

    }

}