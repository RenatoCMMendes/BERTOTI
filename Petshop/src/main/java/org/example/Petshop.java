package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Petshop {

    private List<Cachorro> cachorros = new ArrayList<>();
    private List<Agenda> agendas = new ArrayList<>();

    public void cadastrarCachorro(Cachorro cachorro) {
        cachorros.add(cachorro);
    }

    public void cadastrarAgenda(Agenda agenda) {
        agendas.add(agenda);
    }

    public List<Cachorro> buscarCachorro(String nome) {
        List<Cachorro> cachorrosEncontrados = new ArrayList<>();
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getNome().equals(nome)) {
                cachorrosEncontrados.add(cachorro);
            }
        }
        return cachorrosEncontrados;
    }

    public List<Agenda> buscarAgendaPorHora(String hora) {
        List<Agenda> agendasEncontradas = new ArrayList<>();
        for (Agenda agenda : agendas) {
            if (agenda.getHora().equals(hora)) {
                agendasEncontradas.add(agenda);
            }
        }
        return agendasEncontradas;
    }

    public void excluirCachorro(String nome) {
        Iterator<Cachorro> iterator = cachorros.iterator();
        while (iterator.hasNext()) {
            Cachorro cachorro = iterator.next();
            if (cachorro.getNome().equals(nome)) {
                iterator.remove();
            }
        }
    }

    public void excluirAgenda(String paciente, String hora, String data) {
        Iterator<Agenda> iterator = agendas.iterator();
        while (iterator.hasNext()) {
            Agenda agenda = iterator.next();
            if (agenda.getPaciente().equals(paciente) && agenda.getHora().equals(hora) && agenda.getData().equals(data)) {
                iterator.remove();
            }
        }
    }

    public List<Cachorro> getCachorros() {
        return cachorros;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }
}
