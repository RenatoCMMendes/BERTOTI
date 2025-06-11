package mvc.view;
import javax.swing.*;
import mvc.model.Sensor;
import mvc.view.components.*;
import mvc.controller.Controller;

public class MainView extends JFrame {
    private PanelComposite root = new PanelComposite();
    private TemperatureLabel tempLabel = new TemperatureLabel();
    private JButton updateBtn = new JButton("Nova leitura");
    private Controller controller;

    public MainView(Controller ctrl, Sensor sensor) {
        super("MVC Desktop");
        this.controller = ctrl;
        root.add(tempLabel);
        JPanel main = new JPanel();
        root.render(main);
        main.add(updateBtn);
        add(main);
        setSize(200, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Strategy: view usa o controller para atualizar model
        updateBtn.addActionListener(e -> {
            controller.updateSensor(sensor);
        });

        // Observer: é notificado de mudanças no model
        sensor.addObserver((obs, arg) -> {
            double t = (double) arg;
            tempLabel.setText(controller.format(t));
        });
    }
}
