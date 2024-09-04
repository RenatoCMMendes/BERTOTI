package org.example;

public class App {
    public static void main(String[] args) {
        // Criando uma instância de Petshop
        Petshop petshop = new Petshop();

        // Cadastrando alguns cachorros
        Cachorro cachorro1 = new Cachorro("Rex");
        Cachorro cachorro2 = new Cachorro("Buddy");
        petshop.cadastrarCachorro(cachorro1);
        petshop.cadastrarCachorro(cachorro2);

        // Cadastrando algumas agendas
        Agenda agenda1 = new Agenda("Rex", "09:00", "2024-06-14");
        Agenda agenda2 = new Agenda("Buddy", "10:00", "2024-06-14");
        petshop.cadastrarAgenda(agenda1);
        petshop.cadastrarAgenda(agenda2);

        // Buscando cachorros pelo nome
        System.out.println("Buscando cachorro chamado 'Rex':");
        for (Cachorro c : petshop.buscarCachorro("Rex")) {
            System.out.println(c.getNome());
        }

        // Buscando agendas por hora
        System.out.println("Buscando agendas para 09:00:");
        for (Agenda a : petshop.buscarAgendaPorHora("09:00")) {
            System.out.println("Paciente: " + a.getPaciente() + ", Hora: " + a.getHora() + ", Data: " + a.getData());
        }

        // Exibindo todos os cachorros cadastrados
        System.out.println("Todos os cachorros cadastrados:");
        for (Cachorro c : petshop.getCachorros()) {
            System.out.println(c.getNome());
        }

        // Exibindo todas as agendas cadastradas
        System.out.println("Todas as agendas cadastradas:");
        for (Agenda a : petshop.getAgendas()) {
            System.out.println("Paciente: " + a.getPaciente() + ", Hora: " + a.getHora() + ", Data: " + a.getData());
        }
    }
}
