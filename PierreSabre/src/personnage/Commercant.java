package personnage;

public class Commercant extends Humain {

	public Commercant(String nom,int argent) {
		super(nom,"th�",argent);
	}
	
	public int seFaireExtorquer() {
		int perte = argent;
		argent -= perte;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return perte;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie g�n�reux donateur!");
	}

}