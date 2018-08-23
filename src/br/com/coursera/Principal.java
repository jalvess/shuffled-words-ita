/**
 * 
 */
package br.com.coursera;

import br.com.coursera.factories.FabricaMecanicaDoJogo;
import br.com.coursera.interfaces.MecanicaDoJogo;

/**
 * @author Jose
 *
 */
public class Principal {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.criaMecanicaDoJogo();
		mecanica.iniciarJogo();
		System.out.println(mecanica.getPalavraOriginal());
		System.out.println(mecanica.getPalavraEmbaralhada());
		mecanica.darPalpite("xx");
		mecanica.darPalpite("xx");mecanica.darPalpite("xx");
	}
}
