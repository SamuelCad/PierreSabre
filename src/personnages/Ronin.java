package personnages;

public class Ronin extends Humain{
	private int réputation=1;

	public Ronin(String nom, int argent, int réputation) {
		super(nom, "shochu", argent);
		this.réputation=réputation;
	}

	public int getRéputation() {
		return réputation;
	}
	
	public void provoquer(Yakuza adversaire){
		int force=2*réputation;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if (force>=adversaire.getRéputation()) {
			parler("Je t’ai eu petit yakusa!");
			int argentGagner= adversaire.perdre();
		}
		else {
			réputation-=1;
			int argentPerdu=argent;
			argent=0;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPerdu);
		}
	}
	
	public void donner(Commercant bénéficiaire){
		int argentDonner= (int) (argent*0.1);
		argent-=argentDonner;
		parler(bénéficiaire.getNom()+" prend ces "+ argentDonner +" sous.");
		bénéficiaire.parler(argentDonner+ " sous ! Je te remercie généraux donateur !");
	}
	
}
