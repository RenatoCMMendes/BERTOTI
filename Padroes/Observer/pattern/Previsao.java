package Observer.pattern;

public class Previsao implements Observer {
    @Override
    public void atualizar(Dado dado) {
        System.out.println("Previsão atualizada:");
        System.out.println("Temperatura prevista: " + dado.getTemperatura());
        System.out.println("Umidade prevista: " + dado.getUmidade());
    }
}
