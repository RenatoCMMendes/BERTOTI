package Strategy.antiPattern;
            
public class StrategyAntiPattern {
    public static void main(String[] args) {
        Animal macaco = new Macaco();
        macaco.comer();
        ((Macaco) macaco).mover();

        Animal cao = new Cao();
        cao.comer();
        ((Cao) cao).mover();

        Animal gato = new Gato();
        gato.comer();
        ((Gato) gato).mover();

        Animal papagaio = new Papagaio();
        papagaio.comer();
        ((Papagaio) papagaio).mover();
    }
}