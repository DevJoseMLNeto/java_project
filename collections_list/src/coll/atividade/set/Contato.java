package coll.atividade.set;

import java.util.Objects;

public class Contato {

	private String nome;
	private int numero;
	
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(numero);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {return true;}
		if(obj == null || getClass()!=obj.getClass()) {return false;}
		Contato pessoa = (Contato) obj;
		return Objects.equals(numero, pessoa.getNumero());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + ": " + numero;	
	}
}
