/**
 * 
 */
package br.com.coursera.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.coursera.implementations.EmbaralhadorEasy;
import br.com.coursera.interfaces.Embaralhador;

/**
 * @author Jose
 *
 */
public class EmbaralhadorEasyTest {
	static Embaralhador embaralhador;

	@BeforeClass
	public static void instancia() {
		embaralhador = new EmbaralhadorEasy();
	}

	@Test
	public void testaSortWordComDuasLetras() {
		assertEquals(embaralhador.sortWord("it"), "ti");
	}

	/**
	 * void
	 */
	@Test
	public void testaSortWordComTresLetras() {
		assertEquals(embaralhador.sortWord("céu"), "éuc");
	}

	@Test
	public void testaSortWordComQuatroLetras() {
		assertEquals(embaralhador.sortWord("nova"), "vano");
	}

	@Test
	public void testaSortWordComCincoLetras() {
		assertEquals(embaralhador.sortWord("cisco"), "scoci");
	}
}
