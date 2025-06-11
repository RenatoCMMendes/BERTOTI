package Strategy.pattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Animal gato = new Animal();

        gato.setLocomocao(new Corrida());
        gato.locomover();

        gato.setLocomocao(new Voo());
        gato.locomover();
    }
}