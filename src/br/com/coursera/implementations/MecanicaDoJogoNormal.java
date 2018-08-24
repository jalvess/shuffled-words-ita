/**
 * 
 */
package br.com.coursera.implementations;

import br.com.coursera.BancoDePalavras;
import br.com.coursera.interfaces.Embaralhador;
import br.com.coursera.interfaces.MecanicaDoJogo;

/**
 * @author Jose
 *
 */
public class MecanicaDoJogoNormal extends br.com.coursera.abstractions.MecanicaDoJogo implements MecanicaDoJogo {
	private final int TENTATIVAS_INICIAIS = 3;
	private int tentativas = TENTATIVAS_INICIAIS;
	private final String DIFICULDADE = "Normal";

	/**
	 * @param embaralhador
	 */
	public MecanicaDoJogoNormal(Embaralhador embaralhador) {
		super(embaralhador);
	}

	@Override
	public void iniciarJogo() {
		System.out.println("========================== PALAVRA EMBARALHADA =================================");
		this.tentativas = TENTATIVAS_INICIAIS;
		setFimDeJogo(false);
		setPalavraOriginal(BancoDePalavras.getPalavra());
		setPalavraEmbaralhada(getEmbaralhador().sortWord(getPalavraOriginal()));
		System.out.println(toString());
	}

	/**
	 * @see br.com.coursera.interfaces.MecanicaDoJogo#getTentativas()
	 * @return
	 **/
	@Override
	public int getTentativas() {
		return tentativas;
	}

	@Override
	public void palpiteErrado() {
		tentativas--;
		System.out.println("\nPalpite errado\n");
		System.out.println(toString());
		if (tentativas == 0) {
			setFimDeJogo(true);
			System.out.println("========================== GAME OVER =================================");
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

}
