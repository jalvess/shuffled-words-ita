/**
 * 
 */
package br.com.coursera;

import java.util.Scanner;

import br.com.coursera.factories.FabricaMecanicaDoJogo;
import br.com.coursera.interfaces.MecanicaDoJogo;

/**
 * Classe principal
 * 
 * @author Jose
 *
 */
public class Principal {

	/**
	 * Inicia o jogo de palavras embaralhadas
	 * 
	 * @param args void
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja iniciar o jogo de palavras?\n (Y) - SIM \n (QUALQUER TECLA) - NÃO");
		while (scanner.hasNext() && "y".equalsIgnoreCase(scanner.nextLine())) {
			MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.criaMecanicaDoJogo();
			mecanica.iniciarJogo();
			System.out.println("\nPALAVRA: " + mecanica.getPalavraEmbaralhada());
			while (scanner.hasNext()) {
				mecanica.darPalpite(scanner.nextLine());
				if (mecanica.isFimDeJogo())
					break;
			}
			System.out.println("Deseja jogar novamente?\n (Y) - SIM \n (QUALQUER TECLA) - NÃO");
		}
		scanner.close();
		System.out.println("Saindo do jogo...");
		System.exit(0);
	}
}
