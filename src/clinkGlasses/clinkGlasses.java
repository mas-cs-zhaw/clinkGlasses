package clinkGlasses;

public class clinkGlasses {
	private int anzahlPersonen;
	private static final int MAXANZHALPERSONEN = 20;
	
	public clinkGlasses(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}
	
	public int anstossen() {
		
		if (anzahlPersonen>1 && anzahlPersonen <= MAXANZHALPERSONEN) {
			int countAngestossen =0;
			
			for (int i=1; i<=anzahlPersonen; i++) {
				countAngestossen += i*(i-1)/2;
			}
			System.out.println("Es wurde "+ countAngestossen + " mal angestossen, bei " + anzahlPersonen + " Anzahl Personen");
			return countAngestossen;	
		}
		System.out.println("Zuviele oder zuwenige Personen, Anzahl: "+ anzahlPersonen);
		return 0;
		
	}
}

