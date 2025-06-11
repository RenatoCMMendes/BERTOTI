package Composite.antiPattern;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelaAntipattern extends JFrame {

    private JButton botaoEnviar;
    private JTextField campoTexto;

    public TelaAntipattern() {
        setTitle("Tela com AntiPattern");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaoEnviar = new JButton("Enviar");
        campoTexto = new JTextField(15);

        add(botaoEnviar);
        add(campoTexto);
    }

    public static void main(String[] args) {
        TelaAntipattern tela = new TelaAntipattern();
        tela.setVisible(true);
    }
}
