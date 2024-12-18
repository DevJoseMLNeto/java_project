package Candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
		public static void main(String[] args) {
			
			
			analizarCandidato(1900.0);
			
			
			String [] candidatos = {"JESUS","DEUS","ESPIRITO SANTO","MOISES","PAULO","JOSUE","PEDRO","JOÃO"};
			
			ligarParaContato();
			
			int candidatosSelecionados = 0;
			int candidatoAtual = 0;
			double salarioBase = 2000.0;
			
			while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
				String candidato = candidatos[candidatoAtual];
				double salarioPretendido = valorPretendido();
				
				System.out.println("O candidato "+candidato+" solicitou o valor de salário de "+ salarioPretendido);
				
				if(salarioBase > salarioPretendido) {
		
		      		System.out.println("O candidato "+candidato+" foi selecionado para vaga");
					candidatosSelecionados++;
					}
				candidatoAtual++;					
				}
			}
			
		
		
		static void analizarCandidato(double salarioPretendido) {
			double salarioBase = 2000.0;
			if(salarioBase>salarioPretendido) {
				System.out.println("Ligar para o canidato...");
			}else if(salarioBase==salarioPretendido) {
				System.out.println("Aguardando demais candidatos...");
			}else {
				System.out.println("Ligar para p candidato com contra proprosta...");
			}
		}
		static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800,2200);
		}
		
		static void ligarParaContato() {
			int tentativasRealizadas = 0;
			boolean novaTentativa = true;

			do {
				boolean atendeu = atender();
				novaTentativa = atendeu;
				tentativasRealizadas++;
				System.out.println(tentativasRealizadas);
				if(novaTentativa == false) {
					System.out.println("Atendeu");
				}
				
			}while(novaTentativa && tentativasRealizadas < 3);
		}
		
		static boolean atender() {
			return new Random().nextInt(3)==1;
		}
		
		
}
