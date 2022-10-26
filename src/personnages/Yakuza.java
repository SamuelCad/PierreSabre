package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation=0;
	
	
	public Yakuza(String nom, int argent, String clan, int réputation) {
		super(nom, "whisky", argent);		
	}

	public String getClan() {
		return clan;
	}

	public int getRéputation() {
		return réputation;
	}
	
	public void extorquer(Commerçant victime){
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int argentVoler=victime.getArgent();
		argent+=victime.getArgent();
		victime.seFaireExtorquer();
		parler("J’ai piqué les "+argentVoler+ " sous de Marco, ce qui me fait "+ argent + " sous dans ma poche. Hi ! Hi !");
	}

}
