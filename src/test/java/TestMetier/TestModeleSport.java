
package metier;

import dao.FileReader;
import java.util.List;
import dao.SportDao;
import domaine.Sport;
import java.util.Arrays;
import vue.LstSportsObserver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestModeleSport {

	private Sport sport1;
	private ModeleSports mdSports,mdSports1;
	private LstSportsObserver observer;
	private java.awt.List list;

	@BeforeTest
    protected void setUp()
    {
    	list = new java.awt.List();
    	observer = new LstSportsObserver(list);
    	mdSports= new ModeleSports();
    	
    }


	@Test
	public void shouldReturnNullWhenNoSport()
	{
		assertEquals(mdSports.get(),null);
	}

	@Test
	public void shouldReturnSportWhenSport()
	{
		sport1 = new Sport(1,"Petanque","Petanque sur gazon");
		List<Sport> lst = Arrays.asList(sport1);
		mdSports.setList(lst);
		mdSports.setPos(0);
		assertEquals(mdSports.get(),new Sport(1,"Petanque","Petanque sur gazon"));
	}


	@Test
    public void shouldReturnObserverIfNotNull() {
        mdSports = new ModeleSports(observer);
        int nbOfObservers = mdSports.countObservers();
        assertThat(nbOfObservers).isGreaterThan(0);
    }

	@Test
	public void shouldReturnullWhenObjectListnotCorectlyDefined()
	{
		mdSports1= new ModeleSports();
		assertEquals(mdSports1.get(1),null);
	}


/*    @Test
    public void shouldLoadData() {
       
    }*/

    
}
