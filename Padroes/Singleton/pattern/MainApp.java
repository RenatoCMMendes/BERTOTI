package Singleton.pattern;
            
public class MainApp {
    public static void main(String[] args) {
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();

        logger1.log("Aplicação iniciada.");
        logger2.log("Processando dados...");

        if (logger1 == logger2) {
            System.out.println("Ambos os loggers são a mesma instância (Singleton).");
        } else {
            System.out.println("As instâncias são diferentes! Isso não deveria acontecer.");
        }
    }
}
