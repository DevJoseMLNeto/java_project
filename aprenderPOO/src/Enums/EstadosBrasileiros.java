package Enums;

public enum EstadosBrasileiros {
	
	Bahia("BA","Bahia"),
	Sergipe("SE","Sergipe"),
	Ceara("CE","Ceará"),
	Alagoas("AL","Alagoas"),
	Rio_de_janeiro("RJ","Rio de Janeiro"),
	Espiito_Santo("ES","Espirito Santo"),
	Piaui("PI","Piauí"),
	Amazonas("AM","Amazonas"),
	;
	
	private String nome;
	private String sigla;
	
	private EstadosBrasileiros(String sigla, String nome) {
		this.nome = nome;
		this.sigla = sigla;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
