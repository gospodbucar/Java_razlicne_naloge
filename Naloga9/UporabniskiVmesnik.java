import java.io.*;



public class UporabniskiVmesnik{

   

        public static void main (String []args){

            System.out.println(" *** DOBRODOŠLI NA PARKIRIŠČU *** \n");

            Parkirisce park = new Parkirisce();

            while(true) {

                BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Pritisnite (a) za vnos avta");
                System.out.println("Pritisnite (i) za izpis avtomobilov");
                System.out.println("Pritisnite (j) za izpis avtomobilov po stevilu potnikov");
                System.out.println("Pritisnite (o) za odstranitev avtomobila\n");

                System.out.println("Pritisnite (b) za vnos avtobusa");
                System.out.println("Pritisnite (h) za izpis avtobusov");
                System.out.println("Pritisnite (k) za izpis avtobusov po stevilu potnikov");
                System.out.println("Pritisnite (z) za odstranitev avtobusa\n");

                System.out.println("PRITISNITE (m) ZA PRIKAZ CELOTNEGA PARKIRIŠČA\n");
                System.out.println("Pritisnite (s) za zapis v datoteko");
                System.out.println("Pritisnite (r) za branje iz datoteke");
                System.out.println("Pritisnite (x) za izhod iz programa \n");

                String niz;

                try {
                    niz = br.readLine();
                    char znak = niz.charAt(0);
                    
                    switch (znak) {

                        case 'a':
                            Avto novAvto = Avto.vnesiAvto();
                            park.dodajAvto(novAvto);
                            break;

                        case 'o':// odstrani avto
                            System.out.println("Vnesi parkirno mesto: \n ");  
                            int Mesto11 = Integer.parseInt(br.readLine()); 
                            
                            park.OdstraniAvto(Mesto11);
                            System.out.println("Avtomobil na parkirnem mestu: " + Mesto11 + " je odstranjen \n"); 
                            
                            break;

                        case 'i':
						System.out.println(park.toString());

						break;
                   
                        case 'h':
						System.out.println(park.toStringBus());

						break;

                        case 'm':
						System.out.println(park.toStringOba());

						break;

                        case 's':
						System.out.println("Vnesi ime datoteke za shranjevanje!");

                        String datoteka = br.readLine();
                        park.shraniVdatkoteko(datoteka);
                        System.out.println("Parkirisce je uspešno shranjeno!");
                    	break;

                        case 'j':
                            park.izpisPoSteviluPotnikov();
                            break; 


                        case 'k':
                            park.izpisPoSteviluPotnikovBus();
                         break; 

                         case 'r':
                            System.out.println("Vnesite ime datoteke za branje!");
                            String datoteka1 = br.readLine();
                            park.preberiIzDatoteke(datoteka1);
                            System.out.println("Vozila so uspesno dodana!");
                            break;

                        case 'b':
                            Avtobus novAvtobus = Avtobus.vnesiAvtobus();
                            park.dodajAvtobus(novAvtobus);
                            System.out.println(novAvtobus);
                            break;

                        case 'z':

                        System.out.println("Vnesi parkirno mesto: \n ");  
                        int Mesto21 = Integer.parseInt(br.readLine()); 
                        
                        park.OdstraniBus(Mesto21);
                        System.out.println("Avtobus na parkirnem mestu: " + Mesto21 + " je odstranjen \n");

                        break;
                        
                        case 'x':
                            System.out.println("Program je zakljucen!\n");
                            return;



                        default:
                            System.out.println("Izbira ni pravilna - poskusite ponovno!\n");
                            break;
                    }
                }

                catch(Exception e){

                System.out.println("Napaka pri vnosu = poskusite ponovno\n");


                }

            }

        }
}