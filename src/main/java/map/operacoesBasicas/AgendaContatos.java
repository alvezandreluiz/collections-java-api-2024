package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("André", 123456);
        agendaContatos.adicionarContato("André", 5665);
        agendaContatos.adicionarContato("André Luiz", 1111111);
        agendaContatos.adicionarContato("André Alves", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("André", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("André Alves"));
    }
}
