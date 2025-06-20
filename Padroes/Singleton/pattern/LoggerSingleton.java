package Singleton.pattern;
            
public class LoggerSingleton {

    private static LoggerSingleton instance;

    private LoggerSingleton() {
        System.out.println("Logger inicializado!");
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
