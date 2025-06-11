package Observer.pattern;
            
public class ObserverPattern {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        Observer dashboard = new Dashboard();
        Observer previsao = new Previsao();

        estacao.registrarObserver(dashboard);
        estacao.registrarObserver(previsao);

        Dado dado1 = new Dado("29°C", "60%");
        estacao.setNovoDado(dado1);

        System.out.println("---");

        Dado dado2 = new Dado("31°C", "55%");
        estacao.setNovoDado(dado2);
    }
}