package org.example;

public class Agenda {

    private String paciente;
    private String hora;
    private String data;

    public Agenda(String paciente, String hora, String data) {
        this.paciente = paciente;
        this.hora = hora;
        this.data = data;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
