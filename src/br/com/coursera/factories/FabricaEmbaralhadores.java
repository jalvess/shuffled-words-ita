/**
 * 
 */
package br.com.coursera.factories;

import br.com.coursera.interfaces.Embaralhador;

/**
 * Cria uma implementação randômica de um dos embaralhadores
 * 
 * @author Jose
 *
 */
public class FabricaEmbaralhadores {

	/**
	 * Cria e retorna uma instância de Embaralhador
	 * 
	 * @return Embaralhador
	 */
	public static Embaralhador criaEmbaralhador() {
		String dificuldade = getRandomDificuldade();
		try {
			return (Embaralhador) Class.forName("br.com.coursera.implementations.Embaralhador" + dificuldade)
					.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Retorna uma String aleatória com a dificuldade que será usada no jogo
	 * 
	 * @return String
	 */
	private static String getRandomDificuldade() {
		int jogoEscolhido = (int) Math.floor(Math.random() * Embaralhador.DIFICULDADES);
		switch (jogoEscolhido) {
		case 0: {
			return "Easy";
		}
		case 1: {
			return "Normal";
		}
		default: {
			return "Normal";
		}
		}
	}

}
