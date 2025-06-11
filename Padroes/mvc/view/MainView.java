package mvc.view;

import javax.swing.*;
import mvc.controller.Controller;
import mvc.controller.celsius.CelsiusController;
import mvc.controller.fahrenheit.FahrenheitController;
import mvc.model.Sensor;
import mvc.view.components.*;

public class MainView extends JFrame {
    private PanelComposite root = new PanelComposite();
    private TemperatureLabel tempLabel = new TemperatureLabel();
    private JButton updateBtn = new JButton("Nova leitura");
    private JButton switchBtn = new JButton("Trocar unidade");

    private Sensor sensor;
    private Controller controller;
    private boolean celsius = true;

    public MainView(Controller ctrl, Sensor sensor) {
        super("MVC Termômetro");
        this.controller = ctrl;
        this.sensor = sensor;

        root.add(tempLabel);
        JPanel main = new JPanel();
        root.render(main);
        main.add(updateBtn);
        main.add(switchBtn);
        add(main);
        setSize(250, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        updateBtn.addActionListener(e -> controller.updateSensor(sensor));

        switchBtn.addActionListener(e -> {
            this.controller = celsius ? new FahrenheitController() : new CelsiusController();
            celsius = !celsius;
            tempLabel.setText(controller.format(sensor.getTemperatura()));
        });

        sensor.addObserver((obs, arg) -> {
            double t = (double) arg;
            tempLabel.setText(controller.format(t));
        });
    }
}