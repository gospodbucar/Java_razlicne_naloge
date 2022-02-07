import java.io.*;
public class Postevanka {


    public static void postevanka(int n) {
//IZPIŠEMO ZGORNJO VRSTO

        System.out.format("      ");
        System.out.println();
        System.out.print("     ||");
        for(int i = 1; i<=n;i++ ) {
   
            System.out.format("%4d| ",i );
        }

        System.out.println();
        System.out.println("============================================");
         
        for(int i = 1 ;i<=n;i++) {
//IZPIS PO LEVIH STOLPCIH
            System.out.format("%4d ||",i);
            for(int j=1;j<=n;j++) {


                System.out.format("%4d |",i*j );
  


            }
            System.out.println();
            System.out.println("--------------------------------------------");
        }
    }
     


    public static void main(String[] args)throws Exception {
  
        try{
        System.out.println("Vnesi N: ");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
        int n = Integer.parseInt(br.readLine()); 
       
        System.out.println("Postevanka je : \n" );
     
        postevanka(n);

        
        }
  
        catch(Exception e){
  
              System.out.println("Vneseno stevilo ni pravo!");
  
        }
  
  
  
  
     }
     
    
     
}