package corp.cadastro.client;

import java.util.Objects;

public class Client {
	
	private String nome;
	private String bike;
	private String service;
	private String data;
	private String desc;
	private final int id;
	
	public Client(String nome, String bike, String service, String data, String desc, int id) {

		this.nome = nome;
		this.bike = bike;
		this.service = service;
		this.data = data;
		this.desc = desc;
		this.id = id;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getBike() {
		return bike;
	}
	
	public String getService() {
		return service;
	}

	public String getData() {
		return data;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}
	 
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass())return false;
		Client client = (Client) obj;
		return Objects.equals(id, client.getId());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + bike + service +  data + desc + id;
	}
}
