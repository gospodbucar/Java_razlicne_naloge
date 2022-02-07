class Predmet  {

        public String imePredmeta;
        public String imePredavatelja;
        public int StTock;
        public boolean JeObvezen;


	public String obvezen(boolean JeObvezen){

		String neki ="";

		if(JeObvezen == true){

			neki = "Obvezen";

		}

		else{

			neki = "Neobvezen";
		}

		return neki;

	}

        //KONSTRUKOTRJI
        public Predmet(){

            this.imePredmeta = "";
            this.imePredavatelja ="";
            this.StTock = 0;
            this.JeObvezen = false;
        }

        public Predmet(int StTock){

            this.StTock = StTock;
        }

        public Predmet(String imePredavatelja){

            this.imePredavatelja = imePredavatelja;
        }


        public Predmet (String imePredmeta , String imePredavatelja ,int StTock, boolean JeObvezen){

            this.imePredmeta = imePredmeta;
            this.imePredavatelja = imePredavatelja;
            this.StTock = StTock;
            this.JeObvezen = JeObvezen;
        }

        //GET METODE

        public String getImePredmeta(){

            return this.imePredmeta;
        }

        public String getImePredavatelja(){

            return this.imePredavatelja;
        }



        public int getStTock(){

            return this.StTock;
        }


        public Boolean getJeObvezen(){

            return this.JeObvezen;
        }





        //SET METODE


        public void setImePredmeta(String ime){

            this.imePredmeta = ime;
        }


        public void setImePredavatelja(String novoIme){

           this.imePredavatelja = novoIme;
        }



        public void setStTock(int novoStTock){

            this.StTock = novoStTock;
        }


        public void setJeObvezen(boolean obvezen){

            this.JeObvezen = obvezen;
        }

        public void izpis() {


		
            System.out.println("***   PODATKI O PREDMETU  ***");
            System.out.println("Ime predmeta: " + this.getImePredmeta() + ".");
            System.out.println("Ime predavatelja: " + this.getImePredavatelja()+ ".");
            System.out.println("Število točk: " + this.getStTock());
            System.out.println("Ali je predmet obvezen: " + obvezen(this.getJeObvezen())+ ".");
           
            System.out.println("");   
    
    
       
                
        }




 



}
