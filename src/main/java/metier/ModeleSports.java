/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.FileReader;
import dao.SportDao;
import domaine.Sport;
import java.util.Observer;


/**
 *
 * @author stephaneTRV
 */
public class ModeleSports extends ListeObjects{
    
    FileReader r = new FileReader();
    SportDao sport = new SportDao(r);

    public ModeleSports() {  }
    public ModeleSports(Observer obs) { super(obs); }

    public void loadData(){
        aListe = sport.getListeSports();
        setChanged();
        notifyObservers(new Action(Action.LOAD));
    }
    
    @Override
    public Object get(){
            return (Sport) super.get();
    }
    
    @Override
    public Object get(int pos){
            return (Sport) super.get(pos);
    }
}
