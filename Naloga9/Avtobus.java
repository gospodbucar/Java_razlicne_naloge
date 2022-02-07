import java.io.*;
import java.util.*;

public class Avtobus
{
    private String registracijaBus;
    private String velikostBus;
    private String sofer;
    private ArrayList<Potnik> potniki;

    private int ParkirnoMesto;

    public Avtobus()
    {
        registracijaBus = "";
        velikostBus = "mini";
        sofer = "";
        potniki = new ArrayList<Potnik>();

        ParkirnoMesto = 0;
    }


    
    public Avtobus(String registracijaBus,String velikostBus,String sofer,int StPotnikov, int ParkirnoMesto)
    {
        this.registracijaBus = registracijaBus;
        this.velikostBus = velikostBus;
        this.sofer = sofer;
        this.potniki = new ArrayList<Potnik>();
        this.ParkirnoMesto = ParkirnoMesto;


        for(int i = 1; i <= StPotnikov; i++){

			try{
					Potnik p = Potnik.vnesiPotnika();
					this.potniki.add(p);
			}

			catch(Exception e){

				System.out.println("Napaka pri vnosu");
			}




		}



    }
    public void setRegistracijaBus(String reg)
    {
        this.registracijaBus = reg;
    }
    public String getRegistracijaBus()
    {
        return registracijaBus;
    }
    public void setVelikostBus(String velikostBus)
    {
        this.velikostBus = velikostBus;
    }
    public String getvelikostBus()
    {
        return velikostBus;
    }
    public void setSofer(String sofer)
    {
        this.sofer = sofer;
    }
    public String getSofer()
    {
        return sofer;
    }

	public ArrayList<Potnik> getPotniki() {
		return this.potniki;
	}



    public void setParkirnoMesto(int park)
    {
        this.ParkirnoMesto = park;
    }
    public int getParkirnoMesto()
    {
        return ParkirnoMesto;
    }

    public void izpis() {


		
		System.out.println("***  PODATKI O AVTOBUSU   ***");
		System.out.println("Registracija: " + this.getRegistracijaBus());
		System.out.println("Velikost: " + this.getvelikostBus());
        System.out.println("Šofer: " + this.getSofer());
		System.out.println("Parkirno mesto: " + this.getParkirnoMesto());   
		System.out.println("");   


		for(int i = 0; i < this.potniki.size(); i++) {
			this.potniki.get(i).izpis();
			System.out.println();
		}

			
	}







    public static Avtobus vnesiAvtobus() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***   VNOS NOVEGA AVTOBUSA:   ***");
		System.out.print(" Vnesi registracijo: ");
		String registracija = br.readLine();
		System.out.print(" Vnesi velikost avtobusa (dvonastropni, navadni, mini): ");
        String velikost = br.readLine();
        System.out.print(" Vnesi ime soferja: ");
        String sofer = br.readLine();

        System.out.println("Vnesi stevilo potnikov: ");
		int stevilo = Integer.parseInt(br.readLine());

        System.out.print(" Vnesi parkirirno mesto: ");
		int parking = Integer.parseInt(br.readLine());


		Avtobus novAvtobus = new Avtobus(registracija, velikost, sofer, stevilo, parking);

        System.out.print(" Uspesno ste vnesli avtobus ");

		return novAvtobus;
    }

    
    @Override //tako povozimo metodo nadrazreda z istim imenom ZA BUS
	public String toString() {
		String niz = "";
		niz += "***   PODATKI O AVTOBUSU   ***\n\n";
        niz += ("Registracija:\n " + this.getRegistracijaBus() + "\n");
		niz += ("Velikost: \n" + this.getvelikostBus() + "\n");
		niz += ("Šofer: \n" + this.getSofer() + "\n\n");
		niz += ("Parkirno mesto:\n " + this.getParkirnoMesto() + "\n\n");



		return niz;

	}
    public String shraniKotNiz()
	{
		String zapis = "*B\r\n";				
		zapis += this.registracijaBus + "\r\n";	
        zapis += this.velikostBus + "\r\n";
        zapis += this.sofer + "\r\n";
        zapis += Integer.toString(this.ParkirnoMesto) + "\r\n";

        for(Potnik p : this.potniki){


			zapis += p.shraniKotNiz();


		}
		zapis += "##\r\n";

		return zapis;
	}


    public static Avtobus preberiIzNiza(ArrayList<String> zapis) {

		Avtobus novAvtobus = new Avtobus();

	
        try {
                novAvtobus.setRegistracijaBus(zapis.get(0));
                novAvtobus.setVelikostBus(zapis.get(1));
                novAvtobus.setSofer(zapis.get(2));
                novAvtobus.setParkirnoMesto(Integer.parseInt(zapis.get(3)));

                
			ArrayList<String> potnikPodatki;

			for(int i = 1 ; i < zapis.size(); i++){

				if(zapis.get(i).trim().equals("*P")){

					potnikPodatki = new ArrayList<String>();
					i++;

					while(!zapis.get(i).trim().equals("#")){

						potnikPodatki.add(zapis.get(i));
						i++;
					}

					Potnik novPotnik = Potnik.preberiIzNiza(potnikPodatki);

					novAvtobus.potniki.add(novPotnik);

				}
			}
                
                return novAvtobus;
            }
		

		catch(Exception e){

			System.out.println("Prišlo je do napake v zapisu busa!");
			throw e;


		}


    }
}








