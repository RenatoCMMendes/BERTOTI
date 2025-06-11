package Strategy.pattern;

public class Animal {
    private Locomocao locomocao;

    public void setLocomocao(Locomocao locomocao) {
        this.locomocao = locomocao;
    }

    public void locomover() {
        if (locomocao != null) {
            locomocao.mover();
        } else {
            System.out.println("Nenhuma forma de locomoção definida.");
        }
    }
}