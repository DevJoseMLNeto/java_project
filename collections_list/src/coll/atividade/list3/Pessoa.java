package coll.atividade.list3;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura ) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return Integer.compare(idade, pessoa.getIdade());
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	public String toString() {
		return nome+" "+idade+" "+altura;
	}
	
	
	
	

}
