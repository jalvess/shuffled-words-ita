/**
 * 
 */
package br.com.coursera.interfaces;

import java.io.File;

/**
 * @author Jose
 *
 */
public interface Arquivo {

	static Arquivo instancia(String nome) {
		try {
			Class<?> classe = Class.forName(nome);
			try {
				return (Arquivo) classe.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param file
	 * @param conteudo void 
	 */
	void criaArquivo(File file, String conteudo);
	/**
	 * @param arquivo
	 * @return String 
	 */
	String getConteudo(String arquivo);
}
