package mvc;

import mvc.model.Sensor;
import mvc.view.MainView;
import mvc.controller.Controller;
import mvc.controller.celsius.CelsiusController;

public class MainApp {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Controller ctrl = new CelsiusController(); // ou FahrenheitController
        MainView view = new MainView(ctrl, sensor);
        view.setVisible(true);
    }
}