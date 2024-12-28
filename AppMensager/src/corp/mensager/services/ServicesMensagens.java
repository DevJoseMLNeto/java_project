package corp.mensager.services;

public abstract class ServicesMensagens {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Verificando cenexão");
	}
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando no historico");

	}
}
