/**
 * 
 */
package br.com.coursera.factories;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.coursera.interfaces.Embaralhador;
import br.com.coursera.interfaces.MecanicaDoJogo;

/**
 * @author Jose
 *
 */
public class FabricaMecanicaDoJogo {
	/**
	 * @return MecanicaDoJogo
	 */
	public static MecanicaDoJogo criaMecanicaDoJogo() {
		Embaralhador embaralhador = FabricaEmbaralhadores.criaEmbaralhador();
		String dificuldade = parseDificuldade(embaralhador.getClass().getName());
		try {
			Constructor<?> c = Class.forName("br.com.coursera.implementations.MecanicaDoJogo" + dificuldade)
					.getConstructor(Embaralhador.class);
			return (MecanicaDoJogo) c.newInstance(embaralhador);
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Analisa a String do nome qualificado da classe e retorna a última palavra
	 * 
	 * @param nomeClasse
	 * @return String
	 */
	public static String parseDificuldade(String nomeClasse) {
		return nomeClasse.replaceAll("^[a-z\\.]+[A-Z][a-z]+", "");
	}

}
