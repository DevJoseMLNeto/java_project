package coll.atividade.set;

import java.util.HashSet;
import java.util.Set;

public class SalvandoContato {
	
	private Set<Contato> contatoSalvo;
	
	public SalvandoContato() {
		contatoSalvo = new HashSet<Contato>();
	}
	
	public void addContato(String nome, int numero) {
		contatoSalvo.add(new Contato(nome, numero));
	}
	
	public void returnContato(){
		System.out.println(contatoSalvo);
	}

}
