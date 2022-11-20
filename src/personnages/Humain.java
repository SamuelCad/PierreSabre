package personnages;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Humain {
	
	protected String nom;
	private String boissonFavorite;
	protected int argent;
	protected int nbConnaissance=0;
	protected final int NBMAXCONNAISSANCE=3;
//	private String[] memoire= new String[NBMAXCONNAISSANCE];
	private Queue queue = new LinkedBlockingDeque<String>(NBMAXCONNAISSANCE);

		
	
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
		parler("J'ai "+ argent + " sous en poche. "
				+ "Je vais pouvoir m'offrir une boisson à "+ prix + " sous");
		if (argent>=prix) {
			argent-=prix;
			boire();
		}
		else {
			parler("Je n'ai plus que "+ argent + " sous en poche. "
					+ "Je ne peux même pas m'offrir un kimono à "+ prix + " sous");
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
		if (queue.size() != NBMAXCONNAISSANCE ) {
			queue.add(autreHumain.getNom());
		}
		else {
			queue.remove(); 
			queue.add(autreHumain.getNom());
		}
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : "+
				String.join(", ",queue));
	}
	
	
	
	
	
}
