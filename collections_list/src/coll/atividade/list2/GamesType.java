package coll.atividade.list2;

public class GamesType {
	
	private String nome;
	private int ano;
	private String descricao;
	
	public GamesType(String nome, int ano, String descricao) {
		this.nome = nome;
		this.ano = ano;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome +", "+ ano +", " + descricao;
	}

	

}
