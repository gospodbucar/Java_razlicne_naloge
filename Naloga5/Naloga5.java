import java.io.*;

class Naloga5{

		public static String ObrniNiz(String niz){  //FUNKCIJA KI OBRNE STRING
			
			String novNiz= "";
			int x = niz.length() - 1 ;	
					
			while(x + 1 >0){		
				
				novNiz += niz.charAt(x);			
				x--;
				
			}	
								
			return novNiz;			
			} 
			
			
	public static void main(String [] args)throws IOException{
	
	
				System.out.println("Kateri datoteki želite obrniti niz? A.txt ali B.txt");

				InputStreamReader vt = new InputStreamReader(System.in);		// VNOS IMENA DATOTEKE		
				
				BufferedReader vhod = new BufferedReader(vt);
				String Branje = vhod.readLine();
				
				String Pisanje = "";				

				if (Branje.equals("A.txt")){									//PREVERI V KATERO DAT. ŽELIMO PISAT
					
						Pisanje = "B.txt";
				
				}
				
				else{
				
				Branje = "B.txt";
				Pisanje = "A.txt";
				
				}

				FileReader fr = new FileReader(Branje);				
				BufferedReader Berem = new BufferedReader(fr); 
				
				
				
											//ODPRE DATOTEKO V KATERO ŽELIMO PISAT IN ZAPIŠE
				FileWriter fw = new FileWriter (Pisanje);
				PrintWriter Pisem = new PrintWriter (fw);
				
				while(Berem.ready()){								//GRE ČEZ VSAKO VRSTICO DATOTEKE KI JO PREBEREMO
						String besedilo = Berem.readLine();
						String novobesedilo = ObrniNiz(besedilo);  //OBRNE NIZ Z FUNKCIJO 
						
						
						System.out.println(novobesedilo);				//IZPIŠE V TERMINAL OBRJENO BESEDILO
						Pisem.println(novobesedilo);					//ZAPIŠE V DRUGO DATOTEKO
						}
						
				
				
				
				Berem.close();			//ZAPRE OBE DATOTEKI
				Pisem.close();
		

}
}
		