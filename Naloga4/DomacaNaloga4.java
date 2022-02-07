class DomacaNaloga4{

	public static void main (String[]args){
	
	
	String besedilo ="Vodikova vez je odgovorna tudi za nenavadno obnašanje vode pri zmrzovanju. Kakor druge snovi tudi tekočina z nižanjem temperature postaja gostejša. Vendar, za razliko od drugih snovi, pri ohlajanju blizu ledišča prisotnost vodikove vezi pomeni, da molekule pri preurejanju zaradi zmanjšanja svoje energije na najmanjšo možno mero, tvorijo snov, ki je dejansko manj gosta. Zaradi tega led plava v vodi in voda se pri zmrzovanju razširja.";
	
	
	int DolzinaStr = besedilo.length();		//DOLZINA BESEDILA
	
	besedilo = besedilo.toLowerCase();		//SPREMENI V MALE ČRKE
	
	String shrani = ""; 					
	
	String trenutni = "";
	

	int stevec = 0;  //STEVEC SAMOGLASNIKOV
	
	int indeks = 0;  //INDEKS ZADNJEGA ZNAKA
	
	
		
	
	for (int i = 0; i < DolzinaStr; i++){
	
	
		trenutni = "" + besedilo.charAt(i);
		
		
		if(shrani.contains(trenutni) != true  ){   //SHRANIMO ISTE ZNAKE
		
		shrani += trenutni;
		
		
											}
		 
											
		char ch = besedilo.charAt(i); // PREŠTEJE SAMOGLASNIKE

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				
				stevec = stevec + 1; 
				
			}

	
	
	
	
										}
	
				System.out.println ("V nizu je " + DolzinaStr + " razlicnih znakov in " + stevec + " vseh samoglasnikov");
				
				
	
					
				for(int j = 0; j < shrani.length(); j++){
			
				
					for(int k = 0; k < DolzinaStr; k++) {
					
					
							
							if(shrani.charAt(j) == besedilo.charAt(k)) { //IZPIS ZADNJEGA INDEKSA ZNAKA
					indeks = k ;
				
					
					
					
					
				}

				
				
				
			}
				
					if(shrani.charAt(j) != ' '){ //BREZ PRESLEDKOV
			
			
							System.out.println("Zadnji znak " + shrani.charAt(j) + " je na indeksu " + (indeks));


					}


			indeks = 0;											
			
			
			
				}
			
	
	}


}