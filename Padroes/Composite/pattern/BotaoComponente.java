package Composite.pattern;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoComponente implements ComponenteUI {
    private String texto;

    public BotaoComponente(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar(JPanel painel) {
        painel.add(new JButton(texto));
    }
}
