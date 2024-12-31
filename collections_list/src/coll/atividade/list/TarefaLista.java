package coll.atividade.list;

import java.util.ArrayList;
import java.util.List;

public class TarefaLista {
	
	

	private List<Tarefas> listaDeTarefas;	
	
	public TarefaLista() {
		this.listaDeTarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa( String descricao) {
		listaDeTarefas.add(new Tarefas(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		for(Tarefas t : listaDeTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}

		}
		listaDeTarefas.removeAll(tarefasParaRemover);
		
	}
	
	public int obterNumeroTotalDeTarefas() {
		return listaDeTarefas.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaDeTarefas);
	}
	
	
	
	
}
