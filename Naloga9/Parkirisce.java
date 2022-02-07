import java.io.*;
import java.util.*;

public class Parkirisce {

	public ArrayList<Avto> parkirisce()

	{
		avtomobili = new ArrayList<Avto>();

		return this.avtomobili;
	}

	public ArrayList<Avtobus> avtobusi = new ArrayList<Avtobus>();

	public Parkirisce()
	{
		avtomobili = new ArrayList<Avto>();
		avtobusi = new ArrayList<Avtobus>();
	}

	public Parkirisce(int steviloAvt)
	{
		

		avtomobili = new ArrayList<Avto>();
		for(int i=0; i < steviloAvt; i++)
		{
			try
			{
				Avto a = Avto.vnesiAvto();	
				this.avtomobili.add(a);
			}
			catch (Exception e)
			{
				System.out.println("Prislo je do napake pri vnosu avta!");
			}
		}

		for(int i=0; i < steviloAvt; i++)  
			try
			{
				Avtobus a = Avtobus.vnesiAvtobus();
				this.avtobusi.add(a);
			}
			catch (Exception e)
			{
				System.out.println("Prislo je do napake pri vnosu avta!");
			}
		}



	



	
	private ArrayList<Avto> avtomobili;
	

	
	public ArrayList<Avto> getAvtomobili() {
		return this.avtomobili;
	}

	public ArrayList<Avtobus> getAvtobus()		//GET METODA ZA AVTOBUS
	{
		return this.avtobusi;
	}
	
	public void dodajAvto(Avto avto) {
		if(this.preveriRegistracijo(avto)) {
			System.out.println("Avto s taksno registracijo ze obstaja!");
		} else {
			this.avtomobili.add(avto);
		}
	}

	public void dodajAvtobus(Avtobus avtobus)		//DODAJ AVTOBUS
	{
		this.avtobusi.add(avtobus);
	}



	public String toStringOba()

	{
		String izpis = "na parkiriscu so: \n";
		int x= this.avtomobili.size() + this.avtobusi.size();

	while (x != 0){

		for(int i=0; i < this.avtomobili.size(); i++)
			{
			izpis += this.avtomobili.get(i).toString() ;
			}
		x--;
	

	
		for(int i=0; i < this.avtobusi.size(); i++)
			{
				izpis += this.avtobusi.get(i).toString() + "\n";
			}
		x--;
	}

		return izpis;
	}
	


	public String toString()

	{
	String izpis = "na parkiriscu so avtomobili: \n";
	for(int i=0; i < this.avtomobili.size(); i++)
		{
			izpis += this.avtomobili.get(i).toString() ;
		}
		return izpis;
	}

	public String toStringBus()

	{
	String izpis = "na parkiriscu so Avtobusi: \n";
	for(int i=0; i < this.avtobusi.size(); i++)
		{
			izpis += this.avtobusi.get(i).toString() ;
			
		}
		return izpis;
	}




	public static void main(String[] args) {
		
		Parkirisce park = new Parkirisce();
		
		Avto avto1 = new Avto();
		Avto avto2 = new Avto(1, 0, "registracija");
		
		park.dodajAvto(avto1);
		park.dodajAvto(avto2);
		
		for (int i = 0; i < park.getAvtomobili().size(); i++) {
			//park.getAvtomobili().get(i).izpis();
			System.out.print(park.getAvtomobili().get(i).toString());
			System.out.println();
		}
		
	}
	
	public boolean preveriRegistracijo(Avto avto) {
		boolean pogoj = false;
		
		// for (Avto a : this.avtomobili) {
		for(int i = 0; i < this.avtomobili.size(); i++) {
			// pogoj = a.equals(avto);
			pogoj = this.avtomobili.get(i).equals(avto);
			if(pogoj == true) {
				return true;
			}
		}
		return false;
	}

	public boolean preveriRegistracijo1(Avtobus avtobus) {
		boolean pogoj = false;
		
		for(int i = 0; i < this.avtobusi.size(); i++) {
			pogoj = this.avtobusi.get(i).equals(avtobus);
			if(pogoj == true) {
				return true;
			}
		}
		return false;
	}

	public void OdstraniBus(int stevilo) {
		
		for(int i = 0; i < this.avtobusi.size(); i++) {
			if(this.avtobusi.get(i).getParkirnoMesto() == stevilo );
			 {
				this.avtobusi.remove(i);
			}
		}
	}


	public void OdstraniAvto(int stevilo) {								//ODSTRANI AVTO
		
		for(int i = 0; i < this.avtomobili.size(); i++) {
			if(this.avtomobili.get(i).getParkirnoMesto() == stevilo );
			 {
				this.avtomobili.remove(i);
			}
		}
	}
	

	





	public void izpis() {
		for (int i = 0; i < getAvtomobili().size(); i++) {
			getAvtomobili().get(i).izpis();
			System.out.println();
		}

	}

	public void izpisBus() {
		for (int i = 0; i < getAvtobus().size(); i++) {
			getAvtobus().get(i).izpis();
			System.out.println();
		}

	}
	
	public void izpisPoSteviluPotnikov() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Vnesite stevilo potnikov: \n");
			int stevilo = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < getAvtomobili().size(); i++) {
			if(getAvtomobili().get(i).getPotniki().size() == stevilo) {
				getAvtomobili().get(i).izpis();
				System.out.println();
			}
		}
		}
		catch (Exception e) {
			System.out.println("Napacen vnos!");
		}
		
	}


	public void izpisPoSteviluPotnikovBus() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Vnesite stevilo potnikov: \n");
			int stevilo = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < getAvtobus().size(); i++) {
			if(getAvtobus().get(i).getPotniki().size() == stevilo) {
				getAvtobus().get(i).izpis();
				System.out.println();
			}
		}
		}
		catch (Exception e) {
			System.out.println("Napacen vnos!");
		}
		
	}

	//SHRANI PODATKE V DATOTEKO
	public void shraniVdatkoteko(String imeDatoteke) throws IOException {
		FileWriter fw = new FileWriter(imeDatoteke, true); // Drugi parameter določa, da zapisujemo v obstoječo datoteko od konca datoteke naprej.
		PrintWriter dat = new PrintWriter(fw);
		
		for(Avto a : this.avtomobili) {
			dat.print(a.shraniKotNiz());
		}
		for(Avtobus avtobus : this.avtobusi)
		{
			dat.print(avtobus.shraniKotNiz());
		}
		dat.close();
	}


	
	public int preberiIzDatoteke(String imeDatoteke) throws Exception {
		FileReader fr = new FileReader(imeDatoteke);
		BufferedReader dat = new BufferedReader(fr);
		
		ArrayList<String> busPodatki;
		ArrayList<String> avtoPodatki;
		int stevecDodanihVozil = 0;
		
		while(dat.ready()) {
			String vrstica = dat.readLine().trim().toUpperCase(); // trim() odstrani presledke na začetku in na koncu
			
			if(vrstica.equals("*A")) {
				avtoPodatki = new ArrayList<String>();
				
				while(dat.ready() && !vrstica.equals("###")) {
					vrstica = dat.readLine().trim();
					avtoPodatki.add(vrstica);

				}
				
				Avto novAvto = Avto.preberiIzNiza(avtoPodatki);
				
				if(!preveriRegistracijo(novAvto)) {
					this.avtomobili.add(novAvto);
					stevecDodanihVozil ++;
				}
				else {
					System.out.println("Avto s taksno registracijo ze obstaja!");

				}

			}
			if(vrstica.equals("*B")) {
					busPodatki = new ArrayList<String>();
					
					while(dat.ready() && !vrstica.equals("##")) {
						vrstica = dat.readLine().trim();
						busPodatki.add(vrstica);
	
					}
					
					Avtobus novAvtobus = Avtobus.preberiIzNiza(busPodatki);
					if(!preveriRegistracijo1(novAvtobus)){
					this.avtobusi.add(novAvtobus);
					stevecDodanihVozil++;
					}

					else{
						System.out.println("Avtobus s taksno registracijo ze obstaja!");


					}

			}

			}

		

	
		dat.close();

		return stevecDodanihVozil;

	
	}
}
