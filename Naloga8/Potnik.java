import java.io.*;

public class Potnik {
	
	private String ime;
	private int starost;
	private boolean jeVoznik;
	
	public Potnik() {
		this.ime = "";
		this.starost = 0;
		this.jeVoznik = false;
	}
	
	public Potnik(String ime, int starost) {
		this.ime = ime;
		this.starost = starost;
		this.jeVoznik = false;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	public void setVoznik(boolean voznik) {
		this.jeVoznik = voznik;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public int getStarost() {
		return this.starost;
	}
	
	public boolean getVoznik() {
		return this.jeVoznik;
	}
	
	public void izpis() {
		System.out.println("***   Podatki o potniku   ***");
		System.out.println("Ime: " + this.getIme());
		System.out.println("Starost: " + this.getStarost() + " let");
		System.out.println("Voznik: " + this.getVoznik());
	}
	
	public static Potnik vnesiPotnika() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Potnik p = new Potnik();
		
		System.out.println("***   Vnos novega potnika   ***");
		System.out.println("Vnesi ime: ");
		String niz = br.readLine();
		p.setIme(niz);
		
		System.out.println("Vnesi starost: ");
		int stevilo = Integer.parseInt(br.readLine());
		p.setStarost(stevilo);
		
		System.out.println("Je voznik (da/ne): ");
		niz = br.readLine();
		niz = niz.toLowerCase();
		if(niz.equals("da")) {
			p.setVoznik(true);
		} else {
			p.setVoznik(false);
		}
		
		System.out.println("Uspesno ste vnesli potnika.");
		return p;
		
	}
	
}