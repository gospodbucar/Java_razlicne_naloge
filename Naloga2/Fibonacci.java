class Fibonacci {

    public static void main(String[] args) {

        int n = 12;
        int t1 = 0;
        int t2 = 1;
        int vsota = 0;
        
        
     	System.out.print("Prvih " + n + " lihih števil fibonaccijevega zaporedja je: ");

        for (int i = 1; i <= n; ++i)
        {
        	
        
        	//preverimo ali je ostanek pri deljenju kar pomeni da je število liho
        
        	if(t1%2 == 1)
        	
        		{
        
        
         		    System.out.print(" \n " + t1 + " \n ");
				
					vsota = vsota + t1;
					
				}
				
				
			// kadar ni liha odštejemo i da dobimo na koncu n lihih števil.
			
			else {
			
			i = i -1;
			
			}
			
				
				
				
				
            int sum = t1 + t2; 		
            t1 = t2;
            t2 = sum;		//T2 POSTANE SEŠTEVEK T1 IN T2,     T1 PA POSTANE T2
            
           
            
        }
        //izpis vsote
        
        System.out.println("\n Vsota prvih "+ n + " lihih števil Fibonaccijevega zaporedja je :" + vsota);
        
        
        
    }
}