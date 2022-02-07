class DomacaNaloga3
{
	public static void main(String[] args)	
	{
		// VSTAVIMO ELEMENT
		int n = Integer.parseInt(args[0]);
		
		System.out.println("Praštevila do števila " + n + " so: \n ");
		//USTVARIMO TABELO VELIKOSTI N+1
		
		int [] tabela = new int [n + 1];
		

		

	
		for(int i = 2; i <=n ;i++){
		
			for(int j = 2;  j <= i; j++){  //PREVERI ZA USAK I DO N ALI JE DELJIV Z KATERIMKOLI J. ČE JE BREAK ČE NI ZAPIŠE V TABELO IN IZPIŠE
			
				if(j == i ){
						
				tabela[i] = i;
				
				System.out.print (tabela[i] + " ");
							}
							
				if(i%j == 0){
				
					break;
				
				}
			
			}
		
		
		
		
	}
	
	}
}