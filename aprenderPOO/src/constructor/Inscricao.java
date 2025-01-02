package constructor;

public class Inscricao {

	public static void main (String[] args) {
		Cadastro cadastro = new Cadastro("José", "000001", "Dev Front-End");
		System.out.println(cadastro.getNome());
		System.out.println(cadastro.getId());
		System.out.println(cadastro.getCargo());
		
		cadastro.setNome("Jemima");
		cadastro.setId("000002");
		cadastro.setCargo("Professora");
		
		System.out.println(cadastro.getNome());
		System.out.println(cadastro.getId());
		System.out.println(cadastro.getCargo());
		
		cadastro.setNome("Ariel");
		cadastro.setId("000003");
		cadastro.setCargo("Professora");
		
		System.out.println(cadastro.getNome());
		System.out.println(cadastro.getId());
		System.out.println(cadastro.getCargo());
	}
}
