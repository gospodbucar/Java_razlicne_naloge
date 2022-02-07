import java.io.*;
import java.util.*;

public class  Potnik {

        private String ime ;
        private int starost;
        private boolean jeVoznik;

        public Potnik(){

            this.ime = "";
            this.starost = 0;
            this.jeVoznik = false;

        }
        public Potnik(String ime, int starost){

            this.ime = ime;
            this.starost = starost;
            this.jeVoznik = false;

        }

        public void setIme(String ime){
            this.ime = ime;
        }

        public void setStarost(int starost){
            this.starost = starost;
        }

        public void setVoznik(boolean jeVoznik){
            this.jeVoznik = jeVoznik;
        }



        public String getIme(){
            return this.ime;
        }

        public int getStarost(){
            return this.starost;
        }

        public boolean getVoznik(){
            return this.jeVoznik;
        }

	public void izpis() {
		System.out.println("***   Podatki  o potniku  ***");
		System.out.println("ime: " + this.getIme() + ".");
		System.out.println("Starost: " + this.getStarost() );
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


     

    

    public String shraniKotNiz() {
		String zapis = "*P\r\n";         // *P označuje potnika
		zapis += this.ime + "\r\n";
		zapis += this.starost + "\r\n";
		zapis += this.jeVoznik + "\r\n";
		zapis += "#\r\n";                // # označuje konec branja potnika
		return zapis;
	}



	public static Potnik preberiIzNiza(ArrayList<String> zapis) {
		Potnik potnik = new Potnik();
		try {
			potnik.setIme(zapis.get(0));
			potnik.setStarost(Integer.parseInt(zapis.get(1)));
			potnik.setVoznik(zapis.get(2).toLowerCase().equals("true") ? true : false);
			
			return potnik;
		}
		catch (Exception e) {
			System.out.println("Prislo je do napake v zapisu!");
			throw e;
		}
	}




}