/**
 * 
 */
package br.com.coursera;

import br.com.coursera.interfaces.Arquivo;

/**
 * @author Jose
 *
 */
public class GerenciadorDeArquivo {
	private static final String ARQUIVO = "banco_de_palavras.txt";

	/**
	 * Identifica o tipo de arquivo com base na extens�o e chama o m�todo adequado
	 * para realizar a recupera��o da informa��o
	 * @return String
	 */
	public static String getConteudo() {
		String formato = ARQUIVO.replaceAll("^\\S*\\.", "");
		Arquivo fileFmtMgr = Arquivo.instancia("br.com.coursera.implementations.CriadorDeArquivo" + formato.toUpperCase());
		return fileFmtMgr.getConteudo(ARQUIVO);
	}

}
