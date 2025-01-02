package coll.atividade.set;

public class MainContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalvandoContato salvandoContato = new SalvandoContato();
		salvandoContato.addContato("José", 739912403);
		salvandoContato.addContato("Jemima", 739912401);
		salvandoContato.addContato("Jesus", 739912402);
		salvandoContato.addContato("Jasmim", 739912403);
		
		salvandoContato.returnContato();
	}
	
	

}
