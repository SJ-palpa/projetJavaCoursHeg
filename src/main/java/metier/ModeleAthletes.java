/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import java.util.List;
import dao.FileReader;
import dao.AthleteDao;
import java.util.ArrayList;
import domaine.Athlete;
import domaine.Pays;
import domaine.Sport;
import java.util.Observer;


/**
 *
 * @author stephaneTRV
 */
public class ModeleAthletes extends ListeObjects {
    

    FileReader r = new FileReader();
    AthleteDao AthleteDao = new AthleteDao(r);
    
    public ModeleAthletes() {  }
    public ModeleAthletes(Observer obs) { super(obs); }

    public void loadData(Pays p, Sport s) {
        
        aListe = AthleteDao.getListeAthletes(p, s);
        setChanged(); notifyObservers(new Action(Action.LOAD, NO_POS));
    }

    public Object get() {
        return (Athlete)super.get();
    }
    
    public Object get(int i) {
        return (Athlete)super.get(i);
    }
    
}
