package modele;

public class Employe implements Personne{
	
	private String nom;
	private int id;
	private Adresse adresse;
	
	public Employe(){
		
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", id=" + id + ", adresse=" + adresse + "]";
	}
	
	
	
	

}
