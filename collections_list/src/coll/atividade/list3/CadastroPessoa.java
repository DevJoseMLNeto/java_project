package coll.atividade.list3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CadastroPessoa {
	
	private List<Pessoa> listaPessoas;
	
	public CadastroPessoa() {
		this.listaPessoas = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura){
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public int retornarIndice () {
		return listaPessoas.size();
	}
	
	public List<Pessoa> retornarPorIdade(){
		List<Pessoa> listaIdadePessoa = new ArrayList<>(listaPessoas);
		Collections.sort(listaIdadePessoa);
		return listaIdadePessoa ;
	}

}


