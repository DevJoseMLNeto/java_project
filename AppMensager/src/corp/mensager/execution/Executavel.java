package corp.mensager.execution;

import corp.mensager.MSN.MensagerMSN;
import corp.mensager.facebook.MensagerFacebook;
import corp.mensager.services.ServicesMensagens;
import corp.mensager.telegram.MensagerTelegram;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicesMensagens sm = null;
		String appEscolhido = "MSN";
		
		if(appEscolhido.equals("MSN")) {
			sm = new MensagerMSN();
		}else if (appEscolhido.equals("Facebook")) {
			sm = new MensagerFacebook();
		}else if (appEscolhido.equals("Telegram")) {
			sm = new MensagerTelegram();
		}
		
		sm.enviarMensagem();
		sm.receberMensagem();
		
		
		
	}

}
