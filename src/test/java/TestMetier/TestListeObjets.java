import dao.FileReader;
import java.util.List;
import java.util.Arrays;
import metier.ModelePays;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.testng.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestListeObjets {
	
	private ModelePays mdPays;

	@BeforeMethod
	protected void setUp()
	{
		mdPays = new ModelePays();
	}

	@Test
	public void shouldReturnIntZeroWhenListEmpty()
	{
		List<String> lst = Arrays.asList();
		mdPays.setList(lst);
		assertEquals(mdPays.size(),0);
	}


	@Test
	public void shouldReturnIntTenWhen10()
	{
		List<String> lst = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
		mdPays.setList(lst);
		assertEquals(mdPays.size(),10);
	}

	@Test
	public void shouldReturnminusOneWhenNoPos()
	{
		assertEquals(mdPays.getPos(),-1);
	}


	@Test
	public void shouldReturnThreeWhenPosSetThree()
	{
		List<String> lst = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
		mdPays.setList(lst);
		mdPays.setPos(3);
		assertEquals(mdPays.getPos(),3);
	}

	@Test
	public void shouldReturnullWhenObjectListnotCorectlyDefined()
	{
		assertEquals(mdPays.get(),null);
	}
	
	@Test
	public void shouldReturnullWhenListnotCorectlyDefined()
	{
		assertEquals(mdPays.get(1),null);
	}

	/*@Test
	public void shouldReturnWhenListCorectlyDefined()
	{
		List<String> lst = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
		mdPays.setList(lst);
		assertEquals(mdPays.get(1),null);
	}*/

}