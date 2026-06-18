public class Logger {

    // Stores the single Logger object
    private static Logger loggerInstance;

    // Prevents object creation from outside the class
    private Logger() {
        System.out.println("Logger instance created");
    }

    public static Logger getInstance() {

        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }

        return loggerInstance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}