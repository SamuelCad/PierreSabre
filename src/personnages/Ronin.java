package personnages;

public class Ronin extends Humain{
	private int réputation=1;

	public Ronin(String nom, int argent, int réputation) {
		super(nom, "shochu", argent);
	}

	public int getRéputation() {
		return réputation;
	}
	
	public void donner(Commerçant bénéficiaire){
		int argentDonner= (int) (argent*0.1);
		argent-=argentDonner;
		parler(bénéficiaire.getNom()+" prend ces "+ argentDonner +" sous.");
		bénéficiaire.parler(argentDonner+ " sous ! Je te remercie généraux donateur !");
	}
	
}
