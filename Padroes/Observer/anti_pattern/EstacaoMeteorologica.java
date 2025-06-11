package Observer.anti_pattern;

public class EstacaoMeteorologica {
    private Dashboard dashboard;
    private Previsao previsao;

    public EstacaoMeteorologica() {
        this.dashboard = new Dashboard();
        this.previsao = new Previsao();
    }

    public void novosDados(Dado dado) {
        // Chama diretamente os consumidores (alto acoplamento)
        dashboard.atualizar(dado);
        previsao.atualizar(dado);
    }
}
