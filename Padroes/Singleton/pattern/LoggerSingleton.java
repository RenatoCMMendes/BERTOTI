package Singleton.pattern;
            
// Classe Singleton realista para log de mensagens
public class LoggerSingleton {

    // Atributo estático que armazenará a única instância
    private static LoggerSingleton instance;

    // Construtor privado para evitar instanciamento externo
    private LoggerSingleton() {
        System.out.println("Logger inicializado!");
    }

    // Método público e estático para obter a instância (lazy initialization)
    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    // Método público para registrar uma mensagem de log
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
