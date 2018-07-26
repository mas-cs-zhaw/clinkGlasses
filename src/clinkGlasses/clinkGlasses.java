package clinkGlasses;

public class clinkGlasses {
	private int anzahlPersonen;
	private static final int MAXANZHALPERSONEN = 20;
	
	public clinkGlasses(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}
	
	public int anstossen(int anzahlPersonen) {
		int countAngestossen = anzahlPersonen*(anzahlPersonen-1)/2;
		return countAngestossen;
	}
	
	public int anzeigenTotAngestossen() {
		int totAngestossen = 1;
		System.out.println("Angestossen");
		return totAngestossen;		
	}
}
