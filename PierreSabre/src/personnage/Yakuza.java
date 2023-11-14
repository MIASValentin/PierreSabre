package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom,String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, Tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� " + gain + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public void perdre() {
		int perte = getArgent();
		perdreArgent(perte);
		this.reputation -= 1;
		parler("J�ai perdu mon duel et mes " + perte + " sous, snif... J'ai d�shonor� le clan de Warsong");
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		this.reputation += 1;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ? Je l'ai d�pouill� de ses" + gain + " sous");
	}
}
