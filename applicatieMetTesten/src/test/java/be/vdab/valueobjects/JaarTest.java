package be.vdab.valueobjects;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;



public class JaarTest {
	
	
	@Test
	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
		assertTrue(new Jaar(2000).isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
		assertFalse(new Jaar(1900).isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
		assertTrue(new Jaar(2012).isSchrikkeljaar());
	}
	@Test
	public void eenJaarNietDeelbaarDoor4isGeenSchrikkeljaar() {
		assertFalse(new Jaar(2015).isSchrikkeljaar());
	}
	@Test
	public void equalsOpTweeDezelfdeJarenMoetTrueZijn(){
		assertEquals(new Jaar(2015), new Jaar(2015));
	}
	@Test
	public void equalsOpTweeVerschillendeJarenMoetFalseZijn(){
		assertNotEquals(new Jaar(2015), new Jaar(2016));
	}	
	@Test 
	public void hashCodeOpTweeDezelfdeJarenMoetGelijZijn(){
		assertEquals(new Jaar(2015).hashCode(), new Jaar(2015).hashCode());
	}

	
	

//	@Test
//	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
//		Jaar jaar = new Jaar(2000);
//		Assert.assertEquals(true, jaar.isSchrikkeljaar());
//	}
//	@Test
//	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar(){
//		Assert.assertEquals(false, new Jaar(1900).isSchrikkeljaar());
//	}
//	@Test
//	public void EenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
//		Assert.assertEquals(true, new Jaar(2012).isSchrikkeljaar());
//	}
//	@Test
//	public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar(){
//		Assert.assertEquals(false, new Jaar(2015).isSchrikkeljaar());
//	}	
}
