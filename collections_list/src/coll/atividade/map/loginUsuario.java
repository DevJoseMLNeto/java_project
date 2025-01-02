package coll.atividade.map;

public class loginUsuario {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.addUsuarioSenha("Jemima", 2042006 );
		user.addUsuarioSenha("Josué", 24022032 );
		user.addUsuarioSenha("Jesus", 2042006 );
		user.addUsuarioSenha("José", 29052005);
		
		user.receberUsuarioLogado();
		
		user.buscarUser("Josué");
		

	}

}
