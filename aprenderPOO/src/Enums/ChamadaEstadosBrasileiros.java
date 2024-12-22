package Enums;

public class ChamadaEstadosBrasileiros {


	public static void main (String[] args) {
		
		for(EstadosBrasileiros EB : EstadosBrasileiros.values()) {
			System.out.println(EB.getNome());
			System.out.println(EB.getSigla());
			System.out.println(EB.getNomeMaiusculo());
			System.out.println("********************************************");
			
		}
		
		System.out.println(EstadosBrasileiros.Bahia.getNome());
		
		
		
	}
	
}
