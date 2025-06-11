package mvc;

import mvc.controller.celsius.CelsiusController;
import mvc.model.Sensor;
import mvc.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        MainView viewCelsius = new MainView(new CelsiusController(), sensor);
        viewCelsius.setTitle("Sensor Celsius");
        viewCelsius.setLocation(100, 100);
        viewCelsius.setVisible(true);
    }
}
