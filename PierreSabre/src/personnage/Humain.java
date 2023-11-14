package personnage;

public class Humain {
	private String nom;
	private String boisson_favorite;
	private int argent;
	protected int nbConnaissance = 0;
	private static int NB_CONNAISSANCE_MAX = 30;
	protected Humain memoire[] = new Humain[NB_CONNAISSANCE_MAX];
	
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
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson_favorite + " ! GLOUPS !");
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
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String chaine = "";
		for(int i = 0;i<NB_CONNAISSANCE_MAX;i++)  {
			if (memoire[i] != null)
				chaine +=  memoire[i].getNom() + ", ";
		
		}
		parler("Je connais beaucoup de monde dont: " + chaine);
		
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance >= NB_CONNAISSANCE_MAX)
			nbConnaissance = 0;
		memoire[nbConnaissance] = humain;
		nbConnaissance += 1;
	}
}
