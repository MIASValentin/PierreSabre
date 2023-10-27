package personnage;

public class Humain {
	String nom;
	String boisson_favorite;
	int argent;
	
	public Humain(String nom, String boisson_favorite, int argent) {
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson_favorite() {
		return boisson_favorite;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String phrase) {
		System.out.println("(" + getNom()+ ") - " + phrase);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson_favorite() + ".");
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(prix > argent) {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
		else {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		}
	}
}
