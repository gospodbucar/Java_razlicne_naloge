import java.util.*;
import java.io.*;

public class Urnik{



    public static int Sestejtocke(ArrayList<Predmet> predmeti){ //SESTEJ TOCKE VSEH PREDMETOV


        int skupaj = 0;


            for(int i = 0; i < predmeti.size();i++){

            skupaj += predmeti.get(i).getStTock();
        

        }

        return skupaj;      

    }

    static void izpis(ArrayList<Predmet> predmeti){  //IZPIS VSEH PREDMETOV

            for(int i = 0; i < predmeti.size(); i++) {
                predmeti.get(i).izpis();
                System.out.println();
            }   
    }


static public void IzpisPoPredavatelju(ArrayList<Predmet> predmeti) throws Exception { //IZPIS PO PREDAVATELJU

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    try {
        System.out.println("Vnesite ime predavatelja: \n");
        String profesor = br.readLine();
        
        for (int i = 0; i < predmeti.size(); i++) {
        if(predmeti.get(i).getImePredavatelja().toLowerCase().equals(profesor.toLowerCase())) {
            predmeti.get(i).izpis();
            System.out.println();
        }
    }
    }
    catch (Exception e) {
        System.out.println("Napacen vnos!");
    }
    
    
   
}





    public static void main(String[] args) {




    ArrayList<Predmet> predmeti = new ArrayList<Predmet>(); //NOV SEZNAM

    
    //VNOS PREDMETOV

    Predmet matematika = new Predmet("Matematika", "Borut", 13, true);
    Predmet matematika2 = new Predmet("Matematika 2", "Borut", 16, true);
    Predmet informatika = new Predmet("Informatika", "Kenny", 23, true);
    Predmet programiranje = new Predmet("Programiranje", "Kenny", 20, true);
    Predmet algoritmi = new Predmet("Algoritmi", "Matija", 9, false);
    Predmet fizika = new Predmet("Fizika", "Bine", 10, true);
    Predmet telovadba = new Predmet("Telovadba", "Bine", 3, false);

    //DODAJANJE V SEZNAM

    predmeti.add(matematika);
    predmeti.add(matematika2);
    predmeti.add(informatika);
    predmeti.add(programiranje);
    predmeti.add(algoritmi);
    predmeti.add(fizika);
    predmeti.add(telovadba);

    // IZPIS
    
    System.out.println("Predmeti: \n");

    izpis(predmeti);
    System.out.println(" ------------------------------------------------------------------\n");

    System.out.println(" \n");
    
    System.out.println("Skupno število točk na vseh predmetnik je: " + Sestejtocke(predmeti) + " Točk.\n\n");
    System.out.println(" ------------------------------------------------------------------\n");

    try{
    IzpisPoPredavatelju(predmeti);
    }

    catch (Exception e){
        System.out.println("Napaka");

    }


    

    
    







    }

}