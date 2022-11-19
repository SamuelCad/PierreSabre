package personnages;
public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer(){
		int argentExtorquer = argent;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		argent=0;
		return argentExtorquer;
	}
	
	public void recevoir(int argentDonateur){
			argent = argentDonateur;
			parler(argent+ " sous ! Je te remercie généreux donateur!");
		}
}
