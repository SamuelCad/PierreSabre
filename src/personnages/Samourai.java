package personnages;

public class Samourai extends Humain {
	private String seigneur;
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+ seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? "
				+ "Tiens je vais prendre du "+ boisson);
	}

}
