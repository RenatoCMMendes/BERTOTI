package mvc.view.components;

import javax.swing.*;

public class TemperatureLabel implements UIComponent {
    private JLabel label = new JLabel("N/A");
    public void setText(String t) { label.setText(t); }
    @Override
    public void render(JPanel panel) { panel.add(label); }
}

