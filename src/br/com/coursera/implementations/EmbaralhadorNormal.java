/**
 * 
 */
package br.com.coursera.implementations;

import java.util.Arrays;

import br.com.coursera.interfaces.Embaralhador;

/**
 * Implementação de Embaralhador
 * 
 * @author Jose
 *
 */
public class EmbaralhadorNormal implements Embaralhador {

	/**
	 * 
	 * @see br.com.coursera.interfaces.Embaralhador#sortWord(java.lang.String)
	 * @param palavra
	 * @return
	 **/
	@Override
	public String sortWord(String palavra) {
		int tamanho = palavra.length();
		String[] arrayPalavra = palavra.split("");
		String[] array = new String[tamanho];
		int indice;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				indice = i + 1 < array.length ? i + 1 : i;
				array[i] = arrayPalavra[indice];
			} else
				array[i] = arrayPalavra[i - 1];
		}
		return (Arrays.toString(array).replaceAll("[,\\[\\]\\s]", ""));
	}

}
