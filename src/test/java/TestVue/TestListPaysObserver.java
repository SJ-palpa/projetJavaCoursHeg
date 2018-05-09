package vue;


import domaine.Pays;
import java.awt.List;
import java.util.ArrayList;
import metier.Action;
import metier.ModeleAthletes;
import metier.ModelePays;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestListPaysObserver {
    private LstPaysObserver observer;
    private List list;
    private ModeleAthletes modeleAthletes;
    private ModelePays modelePays;
    private Action action;
    

    @Test
    public void shouldHaveEmptyListIfactionNotAction() {
      
        /*modeleAthletes = new ModeleAthletes();
        modelePays = new ModelePays();
        modeleAthletes = new ModeleAthletes();
        list = new List();
        observer = new LstPaysObserver(list);

        ModelePays.loadData();
        observer.update(ModelePays, "LOAD");
        ArrayList list = new ArrayList();
        for(int i = 0; i<listGUI.getItemCount(); i++) { list.add(listGUI.getItem(i)); } 
        assertThat(list,empty());*/
    }
    
}