package src;

import java.util.List;
import java.util.LinkedList;

public class Petshop {

    private List<Cachorro> cachorros = new LinkedList<Aluno>();
    private List<Agenda> agendas = new LinkedList<Livro>();


    public void cadastrarCachorro(Cachorro cachorro) {
        cachorros.add(cachorro);
    }

    public void cadastrarAgenda(Agenda agenda) {
        agendas].add(agenda);
    }

    public List<Cachorro> buscarCachorro(String nome){
        List<Cachorro> cachorrosEncontrados = new LinkedList<Aluno>();
        for(Cachorro cachorro: cachorros) {
            if(cachorro.getNome().equals(nome)) cachorrosEncontrados.add(cachorro);
        }
        return cachorrosEncontrados;
    }

    public List<Agenda> buscarAgendaporHora(String hora){
        List<Agenda> encontrados = new LinkedList<Livro>();
        for(Agenda agenda:agendas) {
            if(agenda.gethorario().equals(horario)) encontrados.add(agenda);
        }
        return encontrados;
    }

    public List<Cachorro> getCachorros(){
        return cachorros;
    }

    public List<Agenda> getAgendas(){
        return agendas;
    }
}
