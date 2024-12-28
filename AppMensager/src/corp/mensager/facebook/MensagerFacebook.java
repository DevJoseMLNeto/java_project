package corp.mensager.facebook;

import corp.mensager.services.ServicesMensagens;

public class MensagerFacebook extends ServicesMensagens{
		
	public void enviarMensagem() {
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando pelo Facebook");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
}
