package corp.cadastro.client;

public class ClienteCadastrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadastro cadastro = new Cadastro();
		cadastro.cadastrandoCliente("José", "Caloi", "Manutenção", "20-05-2005", "Tudo Ok", 1245);
		cadastro.cadastrandoCliente("Jemima", "Caloi", "Manutenção", "20-05-2005", "Tudo Ok", 1246);
		cadastro.editandoCliente(1245,"Jesus");
		
		cadastro.returnsClient();
	}

}
