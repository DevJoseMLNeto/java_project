package coll.atividade.list;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarefaLista tarefaLista = new TarefaLista();
		tarefaLista.adicionarTarefa("Descansar");
		tarefaLista.adicionarTarefa("Estudar");
		tarefaLista.adicionarTarefa("Trabalhar");
		tarefaLista.adicionarTarefa("Programar");
		tarefaLista.adicionarTarefa("Não ler a biblia");
		int numero = tarefaLista.obterNumeroTotalDeTarefas();
		tarefaLista.obterDescricoesTarefas();
		tarefaLista.adicionarTarefa("Ler a biblia");
		tarefaLista.removerTarefa("Não ler a biblia");
		
		System.out.println(numero);
		tarefaLista.obterDescricoesTarefas();
		
	}

}
