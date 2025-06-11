package Composite.pattern;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class PainelComposto implements ComponenteUI {
    private List<ComponenteUI> componentes = new ArrayList<>();

    public void adicionar(ComponenteUI componente) {
        componentes.add(componente);
    }

    @Override
    public void renderizar(JPanel painel) {
        for (ComponenteUI c : componentes) {
            c.renderizar(painel);
        }
    }
}
