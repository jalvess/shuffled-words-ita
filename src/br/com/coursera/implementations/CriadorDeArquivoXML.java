/**
 * 
 */
package br.com.coursera.implementations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

import com.thoughtworks.xstream.XStream;

import br.com.coursera.exceptions.ArquivoVazioException;
import br.com.coursera.interfaces.Arquivo;

/**
 * 
 * @author Jose
 *
 */
public class CriadorDeArquivoXML implements Arquivo {
	private static final String[] PALAVRAS_RESERVAS = { "BATMAN", "MULHER", "HOMEM", "CABEÇA", "COELHO", "PERSONAGEM",
			"COMPUTADOR", "PESSOA", "MONSTRO ", "CORRIDA", "LAÇO", "CAVALO", "CARRO ", "BEBIDA" };

	/**
	 * Cria um arquivo XML contendo as palavras passadas como parâmetro
	 * 
	 * @see br.com.coursera.interfaces.Arquivo#criaArquivo(java.io.File,
	 *      java.lang.String)
	 * @param file
	 * @param conteudo
	 **/
	@Override
	public void criaArquivo(File file, String conteudo) {
		String[] conteudoArray = conteudo != null && !conteudo.isEmpty() ? conteudo.split("") : PALAVRAS_RESERVAS;
		XStream xstream = new XStream();
		try {
			FileOutputStream output = new FileOutputStream(file);
			Writer writer = new OutputStreamWriter(output, "UTF-8");
			xstream.alias("palavra", String.class);
			xstream.alias("palavras", String[].class);
			xstream.toXML(conteudoArray, writer);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Lê e obtem os dados de um arquivo XML cujo o nome é passado por parâmetro.
	 * Caso o mesmo não exista, um novo é criado e populado 
	 * 
	 * @see br.com.coursera.interfaces.Arquivo#getConteudo(java.lang.String)
	 * @param arquivo
	 * @return
	 **/
	@Override
	public String getConteudo(String arquivo) {
		arquivo = arquivo != null && !arquivo.isEmpty() ? arquivo : "banco_de_palavras.xml";
		File file = new File(arquivo);
		if (!file.exists()) {
			criaArquivo(file, null);
		}
		XStream x = new XStream();
		x.alias("palavra", String.class);
		x.alias("palavras", String[].class);
		String[] texto = (String[]) x.fromXML(file);
		if (texto.length > 0)
			return Arrays.toString(texto).replaceAll("[,\\]\\[]", "");
		throw new ArquivoVazioException("Arquivo vazio");
	}
}
