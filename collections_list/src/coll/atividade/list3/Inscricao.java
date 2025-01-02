package coll.atividade.list3;

import java.util.List;

public class Inscricao {

	public static void main (String[] args) {
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		cadastroPessoa.adicionarPessoa("Jesus", 33, 1.70);
		cadastroPessoa.adicionarPessoa("Jesus", 65, 1.70);
		cadastroPessoa.adicionarPessoa("Jesus", 1234, 1.70);
		cadastroPessoa.adicionarPessoa("Jesus", 3, 1.70);
		
		
		

		System.out.println(cadastroPessoa.retornarPorIdade());
		
	}

}
