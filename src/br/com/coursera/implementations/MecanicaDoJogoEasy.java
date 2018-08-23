/**
 * 
 */
package br.com.coursera.implementations;

import br.com.coursera.interfaces.Embaralhador;
import br.com.coursera.interfaces.MecanicaDoJogo;

/**
 * @author Jose
 *
 */
public class MecanicaDoJogoEasy extends br.com.coursera.abstractions.MecanicaDoJogo implements MecanicaDoJogo {
	private final int TENTATIVAS_INICIAIS = 3;
	private int tentativas = TENTATIVAS_INICIAIS;
	private final String DIFICULDADE = "Fácil";

	/**
	 * @param embaralhador
	 */
	public MecanicaDoJogoEasy(Embaralhador embaralhador) {
		super(embaralhador);
	}

	/**
	 * @see br.com.coursera.interfaces.MecanicaDoJogo#getTentativas()
	 * @return
	 **/
	@Override
	public int getTentativas() {
		return tentativas;
	}
	
	/** @see br.com.coursera.abstractions.MecanicaDoJogo#reiniciaTentativa()
	 	@return 
	 **/
	@Override
	public int reiniciaTentativa() {
		return TENTATIVAS_INICIAIS;
	}

	@Override
	public void palpiteErrado() {
		tentativas--;
		System.out.println("\nPalpite errado\n");
		System.out.println(toString());
		if (tentativas == 0) {
			System.out.println("\n============== GAME OVER ===================\n");
			iniciarJogo();
		}
	}

	@Override
	public void darPalpite(String palpite) {
		if (getPalavraOriginal().equalsIgnoreCase(palpite)) {
			palpiteCorreto();
		} else
			palpiteErrado();
	}

	/**
	 * @see br.com.coursera.interfaces.MecanicaDoJogo#getDificuldade()
	 * @return
	 **/
	@Override
	public String getDificuldade() {
		return DIFICULDADE;
	}

	/**
	 * @see java.lang.Object#toString()
	 * @return
	 **/
	@Override
	public String toString() {
		return "Dificuldade: " + getDificuldade() + "\n" + "Tentativas: " + getTentativas();
	}

	/** @see br.com.coursera.interfaces.MecanicaDoJogo#palpiteCorreto()
	 	 
	 **/
	@Override
	public void palpiteCorreto() {
	}
}
