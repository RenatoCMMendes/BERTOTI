package Observer.anti_pattern;

public class ObserverAntiPattern {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        Dado dado = new Dado("28°C", "65%");
        estacao.novosDados(dado);
    }
}