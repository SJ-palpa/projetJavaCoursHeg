package dao;

import java.util.ArrayList;
import java.util.StringTokenizer;
//import outils.FileStr;
import domaine.Sport;

public class SportDao {
    
    private static final String FICHIER_SPORTS = "Sports.txt";

    public static ArrayList getListeSports() {
		ArrayList aLst = new ArrayList();
        
		/*String[] tabSports = FileStr.read(FICHIER_SPORTS);
        
        for (int i=0; i<tabSports.length; i++) {
            StringTokenizer strT = new StringTokenizer(tabSports[i], ";");
            aLst.add(new Sport(Integer.parseInt(strT.nextToken()), strT.nextToken(),strT.nextToken()));
        }*/
        return aLst;
    }   
}