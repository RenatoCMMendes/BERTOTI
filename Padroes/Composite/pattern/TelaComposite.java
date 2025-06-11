package Composite.pattern;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaComposite extends JFrame {

    public TelaComposite() {
        setTitle("Tela com Composite Pattern");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelSwing = new JPanel();

        PainelComposto painelComposto = new PainelComposto();
        painelComposto.adicionar(new BotaoComponente("Enviar"));
        painelComposto.adicionar(new TextoComponente(15));

        painelComposto.renderizar(painelSwing);
        add(painelSwing);
    }

    public static void main(String[] args) {
        TelaComposite tela = new TelaComposite();
        tela.setVisible(true);
    }
}

