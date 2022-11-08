package histoire;
import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof= new Humain("Prof", "kombucha", 24);
		prof.direBonjour();
		prof.acheter( "kombucha", 12);
		prof.acheter( "kombucha", 11);
		
		System.out.println("---------------------------------------");
		
		Commerçant marco= new Commerçant("Marco",15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("---------------------------------------");
		
		Yakuza yaku= new Yakuza("Yaku Le Noir", 30, "Warsong", 2);
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		System.out.println("---------------------------------------");
		
		Ronin roro = new Ronin("Roro", 60, 2);
		roro.provoquer(yaku);
		
	}
	
	
}
