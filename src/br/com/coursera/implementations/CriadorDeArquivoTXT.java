/**
 * 
 */
package br.com.coursera.implementations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import br.com.coursera.interfaces.Arquivo;

/**
 * @author Jose
 *
 */
public class CriadorDeArquivoTXT implements Arquivo {
	private static final String PALAVRAS_RESERVAS = "BATMAN MULHER HOMEM CABEÇA COELHO PERSONAGEM COMPUTADOR PESSOA MONSTRO CORRIDA LAÇO CAVALO CARRO BEBIDA";

	/**
	 * @see br.com.coursera.interfaces.Arquivo#criaArquivo(java.io.File,
	 *      java.lang.String)
	 * @param file
	 * @param conteudo
	 **/
	@Override
	public void criaArquivo(File file, String conteudo) {
		conteudo = conteudo != null && !conteudo.isEmpty() ? conteudo : PALAVRAS_RESERVAS;
		FileOutputStream input;
		try {
			input = new FileOutputStream(file);
			input.write(conteudo.getBytes());
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see br.com.coursera.interfaces.Arquivo#getConteudo(java.lang.String)
	 * @param arquivo
	 * @return
	 **/
	@Override
	public String getConteudo(String arquivo) {
		arquivo = arquivo != null && !arquivo.isEmpty() ? arquivo : "banco_reserva.txt";
		File file = new File(arquivo);
		if (!file.exists()) {
			criaArquivo(file, null);
		}
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			StringBuffer conteudo = new StringBuffer();
			while (scan.hasNextLine()) {
				conteudo.append(scan.nextLine());
			}
			return conteudo.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
		return null;
	}

}
