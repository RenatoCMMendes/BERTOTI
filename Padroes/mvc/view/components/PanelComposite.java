package mvc.view.components;

import java.util.*;
import javax.swing.*;

public class PanelComposite implements UIComponent {
    private List<UIComponent> components = new ArrayList<>();
    public void add(UIComponent c) { components.add(c); }
    @Override
    public void render(JPanel panel) {
        for (UIComponent c : components) c.render(panel);
    }
}