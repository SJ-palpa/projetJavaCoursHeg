
import dao.FileReader;
import java.util.List;
import dao.SportDao;
import domaine.Sport;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.testng.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.Is.*;
//import static org.hamcrest.core.IsNot.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestSportDao {

	private SportDao dao;
	private FileReader reader;

	@BeforeMethod
	protected void setUp()
	{
		reader = mock(FileReader.class);
		dao = new SportDao(reader);
	}

	@Test
	public void shouldReturnEmptyListWhenArrayEmpty()
	{
		when(reader.readSports()).thenReturn(new String[]{});
		List<Sport> sport = dao.getListeSports();
		assertThat(sport, empty());
	}


	@Test
	public void shouldReturnSingleListSportArrayHasOnline()
	{
		when(reader.readSports()).thenReturn(new String[]{"1;Curling;glace"});
		List<Sport> sport = dao.getListeSports();
		assertThat(sport,is(not(empty())));
		assertThat(sport,hasSize(1));
		assertThat(sport,contains(new Sport(1,"Curling","glace")));
	}

}