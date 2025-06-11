package mvc.controller.celsius;

import mvc.controller.Controller;
import mvc.model.Sensor;
import java.util.Random;

public class CelsiusController implements Controller {
    public void updateSensor(Sensor sensor) {
        sensor.setTemperatura(15 + new Random().nextDouble() * 10);
    }
    public String format(double t) { return String.format("%.1f °C", t); }
}