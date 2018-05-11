
package metier;

import dao.FileReader;
import java.util.List;
import dao.PaysDao;
import domaine.Pays;
import java.util.Arrays;
import vue.LstPaysObserver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestModelePays {

	private Pays pays1,pays2;
	private ModelePays mdPays;
	private LstPaysObserver observer;
	private java.awt.List list;

	@BeforeTest
    protected void setUp()
    {
    	list = new java.awt.List();
    	observer = new LstPaysObserver(list);
    	mdPays = new ModelePays();
        pays1 = new Pays(1,"CH","Suisse");
        pays2 = new Pays(2,"FR","FRANCE");
    }


	@Test
	public void shouldReturnNullWhenNoPays()
	{
		assertEquals(mdPays.get(),null);
	}

	@Test
	public void shouldReturnPaysWhenPays()
	{
		List<Pays> lst = Arrays.asList(pays1);
		mdPays.setList(lst);
		mdPays.setPos(0);
		assertEquals(mdPays.get(),new Pays(1,"CH","Suisse"));
	}


	@Test
	public void shouldReturnPays2WhenPaysPos1()
	{
		List<Pays> lst = Arrays.asList(pays1,pays2);
		mdPays.setList(lst);
		mdPays.setPos(1);
		assertEquals(mdPays.get(), new Pays(2,"FR","FRANCE"));
	}


	@Test
    public void shouldReturnObserverIfNotNull() {
        mdPays = new ModelePays(observer);
        int nbOfObservers = mdPays.countObservers();
        assertThat(nbOfObservers).isGreaterThan(0);
    }


/*    @Test
    public void shouldLoadData() {
       
    }*/

    
}
