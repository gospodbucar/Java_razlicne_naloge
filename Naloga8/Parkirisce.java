import java.io.*;
import java.util.*;

public class Parkirisce {
	
	private ArrayList<Avto> avtomobili;
	
	public Parkirisce() {
		this.avtomobili = new ArrayList<Avto>();
	}
	
	public ArrayList<Avto> getAvtomobili() {
		return this.avtomobili;
	}
	
	public void dodajAvto(Avto avto) {
		if(this.preveriRegistracijo(avto)) {
			System.out.println("Avto s taksno registracijo ze obstaja!");
		} else {
			this.avtomobili.add(avto);
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
	
	public void izpis() {
		for (int i = 0; i < getAvtomobili().size(); i++) {
			getAvtomobili().get(i).izpis();
			System.out.println();
		}
	}
	
	public void izpisPoSteviluPotnikov() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Vnesite stevilo potnikov: ");
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
	
}