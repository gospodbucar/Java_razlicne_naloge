public class Kabrio extends Avto {
	
	private boolean strehaGor;
	private boolean zadnjiSedezi;
	
	public Kabrio() {
		this(true, false); // klice konstruktor tega razreda
		// super(1, 0, "neznana") // klice konstruktor nadrazreda
	}
	
	public Kabrio(boolean stGor, boolean zadSedezi) {
		this.strehaGor = stGor;
		this.zadnjiSedezi = zadSedezi;
	}
	
	public Kabrio(int prestava, double hitrost, String registracija, boolean stGor, boolean zadSedezi) {
		super(prestava, hitrost, registracija);
		this.strehaGor = stGor;
		this.zadnjiSedezi = zadSedezi;
	}
	
	public void setStreha(boolean stGor) {
		this.strehaGor = stGor;
	}
	
	public void setSedezi(boolean zadSedezi) {
		this.zadnjiSedezi = zadSedezi;
	}
	
	public boolean getStreha() {
		return this.strehaGor;
	}
	
	public boolean getSedezi() {
		return this.zadnjiSedezi;
	}
	
	public void izpis() {
		super.izpis();
		System.out.println("Streha gor: " + this.getStreha());
		System.out.println("Zadnji sedezi: " + this.getSedezi());
	}
	
}