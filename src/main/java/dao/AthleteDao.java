package dao;

import java.util.ArrayList;
import java.util.StringTokenizer;
import outils.FileStr;
import domaine.Athlete;
import domaine.Pays;
import domaine.Sport;

public class AthleteDao {

    private final FileReader reader;
    
    public AthleteDao(FileReader reader) { this.reader=reader;}


    public ArrayList getListeAthletes(Pays pays, Sport sport) {
       ArrayList aLst = new ArrayList();
	   String[] tabAthletes = reader.readAthletes();  
        
        for (int i=0; i<tabAthletes.length; i++) {
            StringTokenizer strT = new StringTokenizer(tabAthletes[i], ";");
            Pays p = new Pays(Integer.parseInt(strT.nextToken()));
            Sport s = new Sport(Integer.parseInt(strT.nextToken()));
            if (p.equals(pays) && s.equals(sport)) { aLst.add(new Athlete(Integer.parseInt(strT.nextToken()), strT.nextToken(), strT.nextToken(), pays, sport)); }
        }
        return aLst;
    }   
}