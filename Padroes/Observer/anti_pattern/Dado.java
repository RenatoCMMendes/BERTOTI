package Observer.anti_pattern;

public class Dado {
    private String temperatura;
    private String umidade;

    public Dado(String temperatura, String umidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getUmidade() {
        return umidade;
    }
}
