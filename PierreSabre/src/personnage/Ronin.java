package personnage;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent() * 10/100;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoirArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur*2 >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.getArgent();
			gagnerArgent(gain);
			adversaire.perdre();
			this.honneur += 1;
		}
		else {
			int perte = getArgent();
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(perte);
			perdreArgent(perte);
			this.honneur -= 1;
		}
	}

}
