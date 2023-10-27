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

}
