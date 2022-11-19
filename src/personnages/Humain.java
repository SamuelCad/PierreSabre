package personnages;
import java.util.Queue;

public class Humain {
	
	protected String nom;
	private String boissonFavorite;
	protected int argent;
	protected int nbConnaissance=0;
	protected final int NBMAXCONNAISSANCE=3;
	private String[] memoire= new String[NBMAXCONNAISSANCE];
		
	
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
	
	public void direBonjour(){
		 parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du "+ boissonFavorite+".");
	}

	public void boire(){
		parler("Mmmm, un bon verre de "+boissonFavorite+ " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix){
		parler("J'ai "+ argent + " sous en poche. Je vais pouvoir m'offrir une boisson à "+ prix + " sous");
		if (argent>=prix) {
			argent-=prix;
			boire();
		}
		else {
			parler("Je n'ai plus que "+ argent + " sous en poche. Je ne peux même pas m'offrir un kimono à "+ prix + " sous");
		}
	}
	
	public void faireConnaissace(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriserNom(autreHumain);
		
	}
	public void repondre(Humain humain) {
		direBonjour();
		memoriserNom(humain);
	}
	
	private void memoriserNom(Humain autreHumain) {
		if (nbConnaissance<NBMAXCONNAISSANCE) {
			memoire[nbConnaissance]=autreHumain.getNom();
			nbConnaissance++;
		}
		else {
			memoire[nbConnaissance%NBMAXCONNAISSANCE]=autreHumain.getNom();
			nbConnaissance++;

		}
	}
	
	public void listerConnaissance() {
		int lng;
		if (nbConnaissance>NBMAXCONNAISSANCE) {
			lng=NBMAXCONNAISSANCE;
		}
		else {
			lng=nbConnaissance;
		}
			
		String[] persConnu = new String[lng];
		for (int i = 0; (i<NBMAXCONNAISSANCE) && (memoire[i]!=null); i++ ) {
			persConnu[i]= memoire[i];
		}
		parler("Je connais beaucoup de monde dont : "+
		String.join(", ",persConnu));

	}
	
	
	
	
	
	
}
