/**
 * 
 */
package br.com.coursera.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.coursera.implementations.EmbaralhadorNormal;

/**
 * @author Jose
 *
 */
public class EmbaralhadorNormalTest {
	EmbaralhadorNormal embt = new EmbaralhadorNormal();

	/**
	 * Test method for
	 * {@link br.com.coursera.implementations.EmbaralhadorNormal#sortWord(java.lang.String)}.
	 */
	@Test
	public void testSortWord() {
		assertEquals(embt.sortWord("mulher"), "umhlre");
		assertEquals(embt.sortWord("batma"), "abmta");
		assertEquals(embt.sortWord("menino"), "eminon");
		assertEquals(embt.sortWord("cavalo"), "acavol");
		assertEquals(embt.sortWord("ajems"), "james");
		assertEquals(embt.sortWord("tartaruga"), "attrragua");
		assertEquals(embt.sortWord("céu"), "écu");
		assertEquals(embt.sortWord("ti"), "it");
	}

}
