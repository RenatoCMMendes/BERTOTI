package Observer.pattern;

public interface Sujeito {
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers();
}
