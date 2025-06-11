package mvc.model;
import java.util.*;

public class Sensor extends Observable {
    private double temperatura;
    public void setTemperatura(double t) {
        this.temperatura = t;
        setChanged();
        notifyObservers(temperatura);
    }
    public double getTemperatura() { return temperatura; }
}