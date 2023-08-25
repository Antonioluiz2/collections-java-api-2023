package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  //atributo
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    //Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    /*Set<LocalDate> dateSet = eventosMap.keySet();
    Collection<Evento> values = eventosMap.values();*/
    //eventosMap.get();
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.println("O pr�ximo evento: " + proximoEvento + " acontecer� na data " + proximaData);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atra��o 1");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atra��o 2");
    agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atra��o 3");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "Atra��o 5");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atra��o 6");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
}
