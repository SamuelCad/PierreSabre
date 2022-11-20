package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;


public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "Warsong", 1);
		Ronin roro = new Ronin("Roro", 60, 3);
		Samourai aki = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
//		1.
//		marco.faireConnaissace(roro);
//		marco.faireConnaissace(yaku);
//		marco.faireConnaissace(chonin);
//		marco.faireConnaissace(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
		
//		2.   yaku.direBonjour();
		
		aki.faireConnaissace(marco);
		aki.listerConnaissance();
		aki.boire("bière");

	}

}
