/**
 * 
 */
package br.com.coursera;

import java.util.Arrays;

import br.com.coursera.exceptions.ArquivoVazioException;

/**
 * @author Jose
 *
 */
public class BancoDePalavras {

	/**
	 * Retorna uma palavra aleat�ria
	 * 
	 * @return String
	 */
	public static String getPalavra() {
		String conteudo = GerenciadorDeArquivo.getConteudo();
		return selecionaPalavraDeTexto(conteudo);
	}

	/**
	 * A partir de uma String contendo um texto recebida como par�metro, o m�todo
	 * remove pontua��es e caracteres especiais e retorna uma palavra aleat�ria
	 * 
	 * @param conteudo String
	 * @return String
	 */
	private static String selecionaPalavraDeTexto(String conteudo) {
		String[] palavras = Arrays.toString(conteudo.split(" ")).replaceAll("[^\\w\\s]", "").split(" ");
		int qtdPalavras = palavras.length - 1;
		if (conteudo.length() == 0) {
			throw new ArquivoVazioException("Recurso n�o possui palavras");
		}
		int indice = ((int) Math.round(Math.random() * qtdPalavras));
		return palavras[indice];
	}
}
