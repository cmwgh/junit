package be.vdab.valueobjects;
import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {

	@Test
	public void lepelIsEenPalidroom() {
		Woord woord = new Woord("lepel");
		assertTrue(woord.isPalindroom());
	}
	@Test
	public void vorkIsGeenPalidroom() {
		Woord woord = new Woord("vork");
		assertFalse(woord.isPalindroom());
	}
	@Test
	public void eenLegeStringIsEenPalidroom() {
		Woord woord = new Woord("");
		assertTrue(woord.isPalindroom());
	}
	
}
