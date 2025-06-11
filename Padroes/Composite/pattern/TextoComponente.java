package Composite.pattern;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextoComponente implements ComponenteUI {
    private int largura;

    public TextoComponente(int largura) {
        this.largura = largura;
    }

    @Override
    public void renderizar(JPanel painel) {
        painel.add(new JTextField(largura));
    }
}

