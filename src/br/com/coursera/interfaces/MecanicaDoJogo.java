/**
 * 
 */
package br.com.coursera.interfaces;

/**
 * @author Jose
 *
 */
public interface MecanicaDoJogo {

	/**
	 * @return int
	 */
	public int getTentativas();

	/**
	 * @return String
	 */
	public String getDificuldade();
	
	/**
	 * @return String 
	 */
	public String getPalavraOriginal();
	
	/**
	 * @return String 
	 */
	public String getPalavraEmbaralhada();

	/**
	 * void
	 */
	public void darPalpite(String palpite);

	/**
	 * void
	 */
	public void palpiteErrado();

	/**
	 * void
	 */
	public void palpiteCorreto();
	
	/**
	 *  void 
	 */
	public void iniciarJogo();
}
