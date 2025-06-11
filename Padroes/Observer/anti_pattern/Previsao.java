package Observer.anti_pattern;

public class Previsao {
    public void atualizar(Dado dado) {
        System.out.println("Previsão atualizada com os dados:");
        System.out.println("Temperatura prevista: " + dado.getTemperatura());
        System.out.println("Umidade prevista: " + dado.getUmidade());
    }
}
