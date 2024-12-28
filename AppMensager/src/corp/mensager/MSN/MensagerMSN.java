package corp.mensager.MSN;

import corp.mensager.services.ServicesMensagens;

public class MensagerMSN extends ServicesMensagens {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando pelo MSN");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo pelo MSN");
	}
	
	
}
