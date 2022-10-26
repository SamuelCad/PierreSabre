package personnages;
public class Humain {
	
	private String nom;
	private String boissonFavorite;
	protected int argent;
		
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
		
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}

	public void parler(String texte){
		System.out.println("("+nom+")"+ " - " +texte);
	}
	
	
	public void direBonjonr(){
		 parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du "+ boissonFavorite);
	}

	public void boire(){
		parler("Mmmm, un bon verre de "+boissonFavorite+ " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix){
		direBonjonr();
		parler("J'ai "+ argent + " sous en poche. Je vais pouvoir m'offrir une boisson à "+ prix + " sous");
		if (argent>=prix) {
			argent-=prix;
			boire();
		}
		else {
			parler("Je n'ai plus que"+ argent + "sous en poche. Je ne peux même pas m'offrir un kimono à"+ prix + "sous");
		}
	}
	
}
