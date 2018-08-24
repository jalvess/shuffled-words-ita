/**
 * 
 */
package br.com.coursera.abstractions;

import br.com.coursera.interfaces.Embaralhador;

/**
 * @author Jose
 *
 */
public abstract class MecanicaDoJogo {
	private boolean fimDeJogo;
	private String palavraOriginal;
	private String palavraEmbaralhada;
	private Embaralhador embaralhador;

	public boolean isFimDeJogo() {
		return this.fimDeJogo;
	}

	/**
	 * @param embaralhador
	 */
	public MecanicaDoJogo(Embaralhador embaralhador) {
		this.embaralhador = embaralhador;
	}

	/**
	 * @return Embaralhador
	 */
	public Embaralhador getEmbaralhador() {
		return this.embaralhador;
	}

	/**
	 * @param palavraOriginal void
	 */
	public void setPalavraOriginal(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal;
	}

	/**
	 * @param palavraEmbaralhada void
	 */
	public void setPalavraEmbaralhada(String palavraEmbaralhada) {
		this.palavraEmbaralhada = palavraEmbaralhada;
	}

	/**
	 * @return String
	 */
	public String getPalavraOriginal() {
		return this.palavraOriginal;
	}

	/**
	 * @return String
	 */
	public String getPalavraEmbaralhada() {
		return this.palavraEmbaralhada;
	}

	/**
	 *  void 
	 */
	public void palpiteCorreto() {
		System.out.println("\nACERTOU !!!\n");
		this.fimDeJogo = true;
	}
	
	public void setFimDeJogo(boolean isFim) {
		this.fimDeJogo = isFim;
	}
}
