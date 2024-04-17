package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algo.Anagramme;
import specif.Specification;

public class CodeCoverage {

	
	@Test
	public void testMouton() {
		Anagramme an = new Anagramme();
		Specification sp = new Specification();
		String result = an.makeAnagramme("mouton");
		assertEquals(result,"mnootu");
		assertTrue(sp.isSorted(result));
		
	}
}
