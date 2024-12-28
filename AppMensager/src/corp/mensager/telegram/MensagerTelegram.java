package corp.mensager.telegram;

import corp.mensager.services.ServicesMensagens;

public class MensagerTelegram extends ServicesMensagens {
	
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando pelo Telegram");
	}
		
	public void receberMensagem() {
		System.out.println("Recebendo");
	}
}

