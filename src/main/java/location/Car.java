package location;

public class Car {

	private String immatriculation;
	private int nombreDePlaces;

	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String immatriculation, int nombreDePlaces) {
		super();
		this.immatriculation = immatriculation;
		this.nombreDePlaces = nombreDePlaces;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

	
	
}
