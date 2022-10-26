package histoire;
import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof= new Humain("Prof", "kombucha", 24);
//		prof.direBonjonr();
//		prof.acheter( "kombucha", 12);
//		prof.acheter( "kombucha", 11);
		
		Commerçant marco= new Commerçant("Marco",15);
//		marco.direBonjonr();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
	
		Yakuza yaku= new Yakuza("Yaku Le Noir","whisky", 30, "Warsong", 1);
		yaku.direBonjonr();
		yaku.extorquer(marco);
		
	}
	
	
}
