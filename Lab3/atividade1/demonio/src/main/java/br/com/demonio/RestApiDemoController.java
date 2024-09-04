package br.com.demonio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AgendaDiaria")
public class RestApiDemoController {
    private List<AgendaDiaria> agendas = new ArrayList<>();

    public RestApiDemoController() {
        agendas.addAll(List.of(
                new AgendaDiaria("Reunião"),
                new AgendaDiaria("Treino"),
                new AgendaDiaria("Entrevista"),
                new AgendaDiaria("Chopada")
        ));
    }

    @GetMapping
    Iterable<AgendaDiaria> getAgendas() {
        return agendas;
    }

    @GetMapping("/id")
    Optional<AgendaDiaria> getAgendaById(@RequestParam int id) {
        for(AgendaDiaria agenda : agendas) {
            if (agenda.getId() == id){
                return Optional.of(agenda);
            }
        }
        return Optional.empty();
    }

    @PostMapping
    AgendaDiaria postAgenda(@RequestBody AgendaDiaria agenda) {
        agendas.add(agenda);
        return agenda;
    }

    @PutMapping("/{id}")
    ResponseEntity<AgendaDiaria> putAgenda(@PathVariable int id, @RequestBody AgendaDiaria agenda) {
        int agendaIndex = -1;

        for (AgendaDiaria agenda1 : agendas) {
            if (agenda1.getId() == id) {
                agendaIndex = agendas.indexOf(agenda1);
                agenda.setId(id); // Mantenha o ID do objeto
                agendas.set(agendaIndex, agenda);
            }
        }
        return (agendaIndex == -1) ?
                new ResponseEntity<>(postAgenda(agenda), HttpStatus.CREATED) :
                new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteAgenda(@PathVariable int id) {
        boolean removed = agendas.removeIf(agenda -> agenda.getId() == id);
        return removed ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }
}
