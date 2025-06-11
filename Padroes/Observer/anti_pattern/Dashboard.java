package Observer.anti_pattern;

public class Dashboard {
    public void atualizar(Dado dado) {
        System.out.println("Dashboard atualizado:");
        System.out.println("Temperatura: " + dado.getTemperatura());
        System.out.println("Umidade: " + dado.getUmidade());
    }
}
