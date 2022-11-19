package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation=0;
	
	
	public Yakuza(String nom, int argent, String clan, int réputation) {
		super(nom, "whisky", argent);	
		this.réputation=réputation;
		this.clan=clan;
	}

	public String getClan() {
		return clan;
	}

	public int getRéputation() {
		return réputation;
	}
	
	public int perdre() {
		int argentPerdu=argent;
		argent=0;
		réputation-=1;
		parler("J’ai perdu mon duel et mes "+ argentPerdu+ " sous, snif... J'ai déshonoré le clan de "+ clan +".");
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		argent+=gain;
		réputation+=1;
		parler("Ce ronin pensait vraiment battre "+nom+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	
	public void extorquer(Commercant victime){
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int argentVoler=victime.getArgent();
		argent+=victime.getArgent();
		victime.seFaireExtorquer();
		parler("J’ai piqué les "+argentVoler+ " sous de Marco, ce qui me fait "+ argent + " sous dans ma poche. Hi ! Hi !");
	}

}
