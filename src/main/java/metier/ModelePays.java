/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import dao.PaysDao;
import dao.FileReader;
import domaine.Pays;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author stephaneTRV
 */
public class ModelePays extends ListeObjects {
    
    FileReader r = new FileReader();
    PaysDao pays = new PaysDao(r);

    public ModelePays() {  }
    public ModelePays(Observer obs) { super(obs); }

    public void loadData(){	
	aListe = pays.getListePays();
        setChanged();
        notifyObservers(new Action(Action.LOAD));
    }
    
    
    @Override
    public Object get(){
            return (Pays)super.get();
    }
    
    @Override
    public Object get(int pos){
            return (Pays)super.get(pos);
    }
}
