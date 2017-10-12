package be.vdab.valueobjects;

public class Veiling {
	private int hoogsteBod;
	public void doeBod(int bedrag) {
		if (bedrag > hoogsteBod){
			hoogsteBod = bedrag;
		}
//		throw new UnsupportedOperationException();
		
	}
	public int getHoogsteBod() {
		return hoogsteBod;
//		throw new UnsupportedOperationException();
	}
	
}
