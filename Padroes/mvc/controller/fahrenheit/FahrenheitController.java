package mvc.controller.fahrenheit;

import mvc.controller.Controller;
import mvc.model.Sensor;
import java.util.Random;

public class FahrenheitController implements Controller {
    public void updateSensor(Sensor sensor) {
        double c = 15 + new Random().nextDouble() * 10;
        sensor.setTemperatura(c * 9/5 + 32);
    }
    public String format(double t) { return String.format("%.1f °F", t); }
}