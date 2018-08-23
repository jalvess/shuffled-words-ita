/**
 * 
 */
package br.com.coursera.abstractions;

import br.com.coursera.BancoDePalavras;
import br.com.coursera.interfaces.Embaralhador;

/**
 * @author Jose
 *
 */
public abstract class MecanicaDoJogo {
	private String palavraOriginal;
	private String palavraEmbaralhada;
	private Embaralhador embaralhador;
	private int tentativas;

	/**
	 * @param embaralhador
	 */
	public MecanicaDoJogo(Embaralhador embaralhador) {
		this.embaralhador = embaralhador;
	}

	/**
	 * @return String
	 */
	public String getPalavraOriginal() {
		return this.palavraOriginal;
	}
	
	public int reiniciaTentativa() {
		return 0;
	}


	/**
	 * @return String
	 */
	public String getPalavraEmbaralhada() {
		return this.palavraEmbaralhada;
	}

	public void iniciarJogo() {
		System.out.println("========================== PALAVRA EMBARALHADA =================================");
		this.tentativas = reiniciaTentativa();
		this.palavraOriginal = BancoDePalavras.getPalavra();
		this.palavraEmbaralhada = embaralhador.sortWord(getPalavraOriginal());
		System.out.println(toString());
	}

}
