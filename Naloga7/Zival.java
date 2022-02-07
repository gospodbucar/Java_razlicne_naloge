public class Zival{

	//spremenljivke globalne
	
	private String ime;
	private double starost;
	private boolean mesojeda;

	//KONSTRUKTORJI
	
	public Zival() {
		this.mesojeda = false;
		this.starost = 0;
		this.ime = "Neznano";
	}
	
	public Zival(String ime, double starost, boolean mesojeda) {
		this.ime = ime;
		this.starost = starost;
		this.mesojeda = mesojeda;
	}
	

	public String Mesojeda(boolean mesojeda){ //METODA KI VRNE MESOJEDA ALI RASTLINOJEDA

		String neki ="";

		if(mesojeda == true){

			neki = "Mesojeda";

		}

		else{

			neki = "Rastlinojeda";
		}

		return neki;

	}
	
	// METODA tipa get
	
	
	public String getIme() {
		return this.ime;
	}

	public double getStarost() {
		return this.starost;
	}

	public boolean getMesojeda() {
		
	
		return mesojeda;
	}

	// METODA tipa set 
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setStarost(int starost) {
		this.starost = starost;
	}
	

	
	
	public void setMesojeda(boolean mesojeda) {
		this.mesojeda = mesojeda;
		
		

	}
	
	//IZPIS METODA
	
	public void izpis() {
		System.out.println("***   PODATKI   ***");
		System.out.println("Ime živali je: " + this.getIme() + ".");
		System.out.println("Njena starost je: " + this.getStarost() + " let");
		System.out.println("Mesojeda: " + Mesojeda(this.getMesojeda()));
	}
	
	public static void main (String[]args) throws Exception{
	
		//KREIRANJE NOVIH ŽIVALI
	
		Zival srna = new Zival("Marjan", 4.3 , false);
		Zival aligator = new Zival ("Miha", 3.8 , true);
		Jezi jez = new Jezi ("Robert" , 2.0 , true , 2.3 , true);
		Konji konj = new Konji("Brane", 8.3 , false , 50.0 , 300.5);
		Kace kaca = new Kace("Stanka", 1.0 , false , 135.5 , true);
		




		//IZPIS
		
		
		
		System.out.println("SRNA: ");
		srna.izpis();
		System.out.println(" ");
		
		System.out.println("ALIGATOR: ");
		aligator.izpis();
		System.out.println(" ");
		
		System.out.println("JEŽ: ");
		jez.izpis();
		System.out.println(" ");
				
		System.out.println("KONJ: ");
		konj.izpis();
		System.out.println(" ");
		
				
		System.out.println("KAČA: ");
		kaca.izpis();
		System.out.println(" ");
		
		

	

	
	}

	
	



}