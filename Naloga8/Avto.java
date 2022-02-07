/*
 *	Razred Avto opisuje nekaj lastnosti in funkcionalnosti avtomobila
 */
import java.io.*;
import java.util.*;
 
public class Avto {
	// Konstanta
	private static final double maxHitrost = 240;
	// Polja
	private int prestava;
	private double hitrost;
	private String registracija;
	private ArrayList<Potnik> potniki;
	private int ParkirnoMesto ;


	// KONSTRUKTORJI
	// Imajo enako ime kot razred,
	// izvedejo se ob uporabi klju�ne besede new.
	// Uporabljamo jih za za�etne nastavitve stanj objektov
	public Avto() {
		this.prestava = 1;
		this.hitrost = 0;
		this.registracija = "Neznana";
		this.potniki = new ArrayList<Potnik>();
		this.ParkirnoMesto = 0;
	}

	public Avto(int prestava, double hitrost, String registracija) {
		this.prestava = prestava;
		this.hitrost = hitrost;
		this.registracija = registracija;
		this.potniki = new ArrayList<Potnik>();
	}
	
	public Avto(String registracija, int stPotnikov, int ParkirnoMesto) {
		this.prestava = 1;
		this.hitrost = 0;
		this.registracija = registracija;
		this.potniki = new ArrayList<Potnik>();
		this.ParkirnoMesto = ParkirnoMesto;
		
		for(int i = 1; i <= stPotnikov; i++) {
			try {
				Potnik p = Potnik.vnesiPotnika();
				this.potniki.add(p);
			}
			catch (Exception e) {
				System.out.println("Prislo je do napake pri vnosu!");
			}
		}
	}

	
	// METODE
	// Metode tipa get nam vrnejo vrednosti polj
	public int getPrestava() {
		return this.prestava;
	}

	public double getHitrost() {
		return this.hitrost;
	}

	public double getMaxHitrost() {
		return maxHitrost;
	}

	public String getRegistracija() {
		return this.registracija;
	}
	
	public ArrayList<Potnik> getPotniki() {
		return this.potniki;
	}

	public int getParkirnoMesto(){    //PARKIRNO MESTO
		return this.ParkirnoMesto;
	}

	public void setParkirnoMesto(int parking){   //PARKIRNO MESTO
		this.ParkirnoMesto = parking;
	}


	// Metode tipa set spremenijo vrednost polja
	public void setPrestava(int p) {
		this.prestava = p;
	}
	
	public void setRegistracija(String novaRegistracija) {
		this.registracija = novaRegistracija;
	}

	public void pospesi(double pospesek) {
		if(this.hitrost + pospesek > maxHitrost) {
			this.hitrost = maxHitrost;
		}
		else {
			this.hitrost += pospesek;
		}

		if(this.hitrost < 20) {
			this.prestava = 1;
		}
		else if(this.hitrost < 40) {
			this.prestava = 2;
		}
		else if(this.hitrost < 60) {
			this.prestava = 3;
		}
		else if(this.hitrost < 90) {
			this.prestava = 4;
		}
		else {
			this.prestava = 5;
		}
	}

	public void izpis() {
		System.out.println("***   Podatki o avtu   ***");
		System.out.println("Prestava: " + this.getPrestava() + ".");
		System.out.println("Hitrost: " + this.getHitrost() + " km/h");
		System.out.println("Registracija: " + this.getRegistracija());
		System.out.println("Maksimalna hitrost: " + this.getMaxHitrost() + " km/h");
		System.out.println("Parkirno Mesto: " + this.getParkirnoMesto() + "\n\n"); //IZPIS PARKIRNEGA MESTA

		for(int i = 0; i < this.potniki.size(); i++) {
			this.potniki.get(i).izpis();
			System.out.println();
		}
	}
	
	public static Avto vnesiAvto() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("***   Vnos novega avta   ***");
		System.out.println("Vnesi registracijo: ");
		String niz = br.readLine();
		
		System.out.println("Vnesi stevilo potnikov: ");
		int stevilo = Integer.parseInt(br.readLine());
		
		System.out.println("Vnesi številko parkirnega mesta: ");    //VNOS PARKINGA
		int ParkirnoMesto = Integer.parseInt(br.readLine());

		Avto a = new Avto(niz , stevilo , ParkirnoMesto);

		System.out.println("Uspešno ste vnesli avto");

		return a;
	}
	
	@Override //tako povozimo metodo nadrazreda z istim imenom
	public String toString() {
		String niz = "";
		niz += "***   Podatki o avtu   ***\n";
		niz += ("Prestava: " + this.getPrestava() + ".\n");
		niz += ("Hitrost: " + this.getHitrost() + " km/h\n");
		niz += ("Registracija: " + this.getRegistracija() + "\n");
		niz += ("Maksimalna hitrost: " + this.getMaxHitrost() + " km/h\n\n");
		niz += ("Parkirno mesto: " + this.getParkirnoMesto() + "\n\n");
		return niz;
	}
	
	public boolean equals(Avto avto) {
		if(this.registracija.equals(avto.getRegistracija())) {
			return true;
		}
		return false;
	}

}