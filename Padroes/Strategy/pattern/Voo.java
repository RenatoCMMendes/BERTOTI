package Strategy.pattern;

public class Voo implements Locomocao {
    @Override
    public void mover() {
        System.out.println("Voando...");
    }
}