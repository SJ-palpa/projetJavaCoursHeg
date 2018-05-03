/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.FileReader;
import dao.SportDao;
import domaine.Sport;

/**
 *
 * @author stephaneTRV
 */
public class ModeleSports extends ListeObjects{
    
    
    public void loadData(){
	FileReader r = new FileReader();
	SportDao sport = new SportDao(r);
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
