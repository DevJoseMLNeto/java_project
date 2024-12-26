package constructor;

public class Cadastro {
	
	private String nome;
	private String id;
	private String cargo;

	public Cadastro(String nome,String id,String cargo) {
		this.nome = nome;
		this.id = id;
		this.cargo = cargo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getId() {
		return id;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	

}
