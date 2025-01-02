package corp.cadastro.client;

import java.util.HashSet;
import java.util.Set;

public class Cadastro {
	
	private Set<Client> clientCadastrado;

	public Cadastro() {
		this.clientCadastrado = new HashSet<Client>();
	}
	
	protected void cadastrandoCliente(String nome, String bike, String service, String data, String desc, int id) {
		clientCadastrado.add(new Client(nome, bike, service, data, desc, id));
	}
	
	protected void editandoCliente(int id, String novoNome) {
		
	
		for(Client c: clientCadastrado) {
			if(c.getId() == id) {
				c.setNome(novoNome);
				break;
			}
		}

	}
	
	protected void returnsClient() {
		System.out.println(clientCadastrado);
	}

}
