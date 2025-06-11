package Observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Sujeito {
    private List<Observer> observers;
    private Dado dado;

    public EstacaoMeteorologica() {
        this.observers = new ArrayList<>();
    }

    public void setNovoDado(Dado dado) {
        this.dado = dado;
        notificarObservers();
    }

    @Override
    public void registrarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(dado);
        }
    }
}
