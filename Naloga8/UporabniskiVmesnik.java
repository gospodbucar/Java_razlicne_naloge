import java.io.*;

public class UporabniskiVmesnik {
	
	public static void main(String[] args) {
		
		System.out.println("\n*** DOBRODOSLI NA PARKIRISCU ***\n");
		
		Parkirisce park = new Parkirisce();
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Pritisnite (a) za vnos avta");
			System.out.println("Pritisnite (i) za izpis avtomobilov");
			System.out.println("Pritisnite (j) za izpis po stevilu potnikov");
			System.out.println("Pritisnite (o) za odstranitev avtomobila\n");
			System.out.println("Pritisnite (x) za izhod iz programa");
			
			String niz;
			
			try {
				niz = br.readLine();
				char znak = niz.charAt(0);
				
				switch (znak) {
					case 'a':
						Avto novAvto = Avto.vnesiAvto();
						park.dodajAvto(novAvto);
						break;
					case 'i':
						park.izpis();
						break;
					case 'j':
						park.izpisPoSteviluPotnikov();
						break;

						case 'o':// ODSTRANI AVTO
						System.out.println("Vnesi parkirno mesto: \n ");  
						int Mesto11 = Integer.parseInt(br.readLine()); 
						
						park.OdstraniAvto(Mesto11);
						System.out.println("Avtomobil na parkirnem mestu: " + Mesto11 + " je odstranjen \n"); 
						
						break;

					case 'x':
						System.out.println("Program je zakljucen!");
						return;
					default:
						System.out.println("Izbira ni pravilna - poskusite ponovno!");
						break;
				}
			}
			catch (Exception e) {
				System.out.println("Napaka pri vnosu - poskusite ponovno!");
			}
		}
		
	}
	
}