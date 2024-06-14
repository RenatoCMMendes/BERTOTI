package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {

    private Petshop pet;

    @BeforeEach
    void setup() {
        pet = new Petshop();
        // Cadastro inicial de alguns cachorros e agendas
        pet.cadastrarCachorro(new Cachorro("bella"));
        pet.cadastrarCachorro(new Cachorro("spike"));
        pet.cadastrarAgenda(new Agenda("bella", "09:00", "24052024"));
        pet.cadastrarAgenda(new Agenda("spike", "10:00", "25052024"));
    }

    @Test
    void testCadastrarCachorro() {
        pet.cadastrarCachorro(new Cachorro("max"));
        assertEquals(3, pet.getCachorros().size());
        assertEquals("max", pet.getCachorros().get(2).getNome());
    }

    @Test
    void testBuscarCachorroExistente() {
        List<Cachorro> encontrados = pet.buscarCachorro("spike");
        assertEquals(1, encontrados.size());
        assertEquals("spike", encontrados.get(0).getNome());
    }

    @Test
    void testBuscarCachorroInexistente() {
        List<Cachorro> encontrados = pet.buscarCachorro("rex");
        assertTrue(encontrados.isEmpty());
    }

    @Test
    void testExcluirCachorro() {
        List<Cachorro> cachorrosAntes = pet.getCachorros();
        pet.excluirCachorro("bella");
        List<Cachorro> cachorrosDepois = pet.getCachorros();

        assertEquals(2, cachorrosAntes.size());
        assertEquals(1, cachorrosDepois.size());
        assertFalse(cachorrosDepois.contains(new Cachorro("bella")));
    }

    @Test
    void testCadastrarAgenda() {
        pet.cadastrarAgenda(new Agenda("rex", "11:00", "26052024"));
        assertEquals(3, pet.getAgendas().size());
        assertEquals("rex", pet.getAgendas().get(2).getPaciente());
    }

    @Test
    void testBuscarAgendaPorHoraExistente() {
        List<Agenda> agendasEncontradas = pet.buscarAgendaPorHora("10:00");
        assertEquals(1, agendasEncontradas.size());
        assertEquals("25052024", agendasEncontradas.get(0).getData());
    }

    @Test
    void testBuscarAgendaPorHoraInexistente() {
        List<Agenda> agendasEncontradas = pet.buscarAgendaPorHora("08:00");
        assertTrue(agendasEncontradas.isEmpty());
    }

    @Test
    void testExcluirAgenda() {
        List<Agenda> agendasAntes = pet.getAgendas();
        pet.excluirAgenda("bella", "09:00", "24052024");
        List<Agenda> agendasDepois = pet.getAgendas();

        assertEquals(2, agendasAntes.size());
        assertEquals(1, agendasDepois.size());
        assertFalse(agendasDepois.contains(new Agenda("bella", "09:00", "24052024")));
    }
}
