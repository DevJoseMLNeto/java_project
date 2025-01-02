package coll.atividade.map;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	
	Map<String, Integer> usuarioLogado;

	public Usuario() {
		this.usuarioLogado = new HashMap<String, Integer>();
	}
	
	
	public void addUsuarioSenha(String user, int password) {
		usuarioLogado.put(user, password);
	}
	
	public void receberUsuarioLogado(){
		System.out.println(usuarioLogado);
	}
	
	public void buscarUser(String user) {
		Object userbucado = usuarioLogado.get(user);
		System.out.println(userbucado);
	}

}
