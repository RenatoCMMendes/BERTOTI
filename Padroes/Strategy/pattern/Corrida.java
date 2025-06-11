package Strategy.pattern;

public class Corrida implements Locomocao {
    @Override
    public void mover() {
        System.out.println("Correndo...");
    }
}