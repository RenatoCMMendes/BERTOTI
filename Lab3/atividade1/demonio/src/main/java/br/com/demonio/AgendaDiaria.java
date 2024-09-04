package br.com.demonio;

public class AgendaDiaria {
    private static int idCounter = 0;
    private final int id;
    private String compromisso;

    public AgendaDiaria(int id, String compromisso) {
        this.id = id;
        this.compromisso = compromisso;
    }

    public AgendaDiaria(String compromisso){
        this(++idCounter, compromisso);
    }

    public int getId() {
        return id;
    }

    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
    }

    public void setId(int id) {
    }
}
