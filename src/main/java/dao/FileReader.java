package dao;

import outils.FileStr;

public class FileReader {

	FileStr fileStr = new FileStr();

	private static final String FICHIER_PAYS = "Pays.txt";
	private static final String FICHIER_SPORTS = "Sports.txt";
	private static final String FICHIER_ATHELETES = "Athletes.txt";

	//public String[] read(String FICHIER) {return fileStr.read(FICHIER);}
	public String[] readPays() {return fileStr.read(FICHIER_PAYS);}	
	public String[] readSports() {return fileStr.read(FICHIER_SPORTS);}
	public String[] readAthletes() {return fileStr.read(FICHIER_ATHELETES);}
}