package metier;

import dao.FileReader;
import java.util.List;

import domaine.Athlete;
import domaine.Pays;
import domaine.Sport;
import java.util.Arrays;
import vue.LstAthletesObserver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestModeleAtheletes {

	private Athlete ath1;
	private Pays pays1;
	private Sport sport1;
	private ModeleAthletes mdAth;
	private LstAthletesObserver observer;
	private java.awt.List list;

	@BeforeTest
    protected void setUp()
    {
    	list = new java.awt.List();
    	observer = new LstAthletesObserver(list);
    	mdAth= new ModeleAthletes();
    	sport1 = new Sport(1,"Petanque","Petanque sur gazon");
    	pays1 = new Pays(1,"CH","Suisse");
    }


	@Test
	public void shouldReturnNullWhenNoSport()
	{
		assertEquals(mdAth.get(),null);
	}

	@Test
	public void shouldReturnSportWhenSport()
	{
		ath1 = new Athlete(1,"Teddy","Rinner",pays1,sport1);
		List<Athlete> lst = Arrays.asList(ath1);
		mdAth.setList(lst);
		mdAth.setPos(0);
		assertEquals(mdAth.get(),new Athlete(1,"Teddy","Rinner",pays1,sport1));
	}


	@Test
    public void shouldReturnObserverIfNotNull() {
        mdAth = new ModeleAthletes(observer);
        int nbOfObservers = mdAth.countObservers();
        assertThat(nbOfObservers).isGreaterThan(0);
    }

	@Test
	public void shouldReturnullWhenObjectListnotCorectlyDefined()
	{
		mdAth= new ModeleAthletes();
		assertEquals(mdAth.get(1),null);
	}


/*    @Test
    public void shouldLoadData() {
       
    }*/

    
}
