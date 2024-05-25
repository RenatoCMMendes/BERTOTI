package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class Teste {

    @Test
    void test() {

        Petshop pet = new Petshop();

        pet.cadastrarCachorro(new Cachorro("bella"));
        pet.cadastrarCachorro(new Cachorro("spike"));

        assertEquals(pet.getCachorro().size(), 2);
        assertEquals(pet.getCachorro().get(0).getNome(), "spike");

        List<Cachorro> encontrados = pet.buscarCachorro("bella");

        assertEquals(encontrados.size(), 1);


        pet.cadastrarAgenda(new Agenda("bella", "24052024"));

        assertEquals(pet.getAgenda().size(), 1);

        List<Agenda> AgendasEncontrados = pet.buscarAgendaporHora("bella");

        assertEquals(AgendasEncontrados.get(0).getData(),"24052024");

    }

}
