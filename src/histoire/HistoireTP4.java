package histoire;
import personnages.Humain;
import personnages.Commerçant;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof= new Humain("Prof", "kombucha", 24);
//		prof.direBonjonr();
//		prof.acheter( "kombucha", 12);
//		prof.acheter( "kombucha", 11);
		
		Commerçant marco= new Commerçant("Marco",20);
		marco.direBonjonr();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
	
	
}
