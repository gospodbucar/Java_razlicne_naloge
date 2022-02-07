import java.io.*;
public class Avto{


		//Globalne spremenljivke objekta
		private int prestava;
		private double hitrost;
		private String registracija;
		private int letnik ;
		private int StPotnikov;
		private double LitriGoriva;
		//private double maxHitrost;
		
		private static final double maxHitrost =240.0 ;
		private static final double MaxLitrovGoriva =50.0 ;   //MAX PROSTORNINA TANKA
		
		
		
		//Prazen konstruktor
		public Avto() {
		
		prestava = 0;
		hitrost = 0.0;
		registracija = "Neznana";
		letnik = 0;
		StPotnikov = 1;							//DODANE LASNOSTI ZA DN
		LitriGoriva = 0.0;						//DODANE LASNOSTI ZA DN
		
		}



		public Avto(String registracija) {
		
		this.registracija = registracija;
		}


		public Avto(String registracija,int letnik, double hitrost, int prestava , int StPotnikov , double LitriGoriva){
		
		this.prestava = prestava;
		this.hitrost = hitrost;
		this.registracija = registracija;
		this.letnik = letnik;
		this.StPotnikov = StPotnikov;
		this.LitriGoriva = LitriGoriva;
		
		
		
		
		}


		// METODE GET IN SET
		
		public void setStPotnikov(int StPotnikov){
		
			this.StPotnikov = StPotnikov;
		
		}
		
		public int getStPotnikov(){
		
			return this.StPotnikov;
		
		}
		
		public void setLitriGoriva(double LitriGoriva){
		
			this.LitriGoriva = LitriGoriva;
		
		}
		
		public double getLitriGoriva(){
		
			return this.LitriGoriva;
		
		}
		

		public void setPrestava(int prestava){
		
			this.prestava = prestava;
		
		}

		public void setLetnik(int letnik){
		
			this.letnik = letnik;
		
		}
		
		
		public int getPrestava(){
		
		return this.prestava;
		
		}

		public int getLetnik(){
		
			return this.letnik;
			
			}
		
		
		public void setHitrost(double hitrost){
		
			this.hitrost = hitrost;
		
		}
		
		public double getHitrost(){
		
			return hitrost;
		
		}
		
		
		public void setRegistracija(String registracija){
		
			this.registracija = registracija;
		
		}
		
		public String getRegistracija(){
		
		return this.registracija;
		
		}

		//METODA POSPESI
		
		public void pospesi(double pospesek){
		
			if (this.hitrost + pospesek > maxHitrost){
			
			setHitrost(maxHitrost);
			
			}
			
			
			else{
			
				this.hitrost += pospesek;
			}

			
			if(this.hitrost < 20){
			
			setPrestava(1);
			
			}
		
			else if(this.hitrost < 40){
			
			setPrestava(2);
			
			}
			
			else {
			
			setPrestava(3);
			
			}
		}
		
		//METODA ZA IZPIS
		
		public void izpisi(){
		
		
			System.out.println("Prestava " + this.prestava);
			System.out.println("Hitrost " + this.hitrost);
			System.out.println("Registracija " + this.registracija);	
			System.out.println("Letnik " + this.letnik);							//DODANE LASNOSTI DN
			System.out.println("Maksimalna hitrost " + maxHitrost);	
			System.out.println("Število potnikov je  " + this.StPotnikov);	
			System.out.println("Goriva je " + this.LitriGoriva + " litrov.");		//DODANE LASNOSTI DN
			System.out.println("Prostornina rezervarja je  " + MaxLitrovGoriva);	//DODANE LASNOSTI DN

		}
		
		// DODANA METODA ZA TANKAT
		
		public void NatociGorivo(double gorivo){
		
			
			if (this.LitriGoriva + gorivo > MaxLitrovGoriva){
			
			setLitriGoriva(MaxLitrovGoriva);
			
			}
			
			
			else{
			
				this.LitriGoriva += gorivo;
			}

			
	
		}
		
		
		
		
		
		
		
		
		
		public static void main (String[] args)throws Exception {
		
		Avto a = new Avto("Registracija");
		Avto a1 = new Avto ("Reg");
		
		a.setPrestava(1);
		a.setHitrost(20);
		a.setStPotnikov(3);
		a.setLetnik(1990);
		a.setLitriGoriva(30.3);
		
		a.izpisi();
		
		System.out.println(" ");
		a1.izpisi();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		while (a1.getHitrost() < 240) {
		
		System.out.println("Vnesi pospešek ");
		String vrstica = br.readLine();
		
		double d = Double.parseDouble(vrstica);
		a1.pospesi(d);
		
		
		}
		
		
		System.out.println("Pretitravati nesmemo!");
		
		a1.izpisi();
		
		
		
		
		// DODANO MOŽNOST TANKANJA DO 50 LITROV
		
		
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		
		while (a1.getLitriGoriva() < 50.0) {
		
		System.out.println("Koliko goriva želite dotočiti ");
		String vrstica1 = br1.readLine();
		
		int e = Integer.parseInt(vrstica1);
		a1.NatociGorivo(e);
		
		
		}
		
		
		System.out.println("Tank je poln!");
		
		a1.izpisi();
		
		
		}
		

 }