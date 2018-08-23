/**
 * 
 */
package br.com.coursera.implementations;

import br.com.coursera.interfaces.Embaralhador;

/**
 * @author Jose
 *
 */
public class EmbaralhadorEasy implements Embaralhador {

	/**
	 * Troca a primeira metade da palavra pela segunda
	 * @see br.com.coursera.interfaces.Embaralhador#sortWord(java.lang.String)
	 * @param palavra
	 * @return
	 **/
	@Override
	public String sortWord(String palavra) {
		int tamanho =  palavra.length();
		int meio = (int) Math.ceil(tamanho / 2);
		String newWord = palavra.substring(meio) + palavra.substring(0, meio);
		return newWord;
	}
}
