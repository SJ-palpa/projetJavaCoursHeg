
package dao;

import domaine.Athlete;
import domaine.Pays;
import domaine.Sport;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAtheleteDao {

	private AthleteDao dao;
	private FileReader reader;
	private Pays pays;
    private Sport sport;

	@BeforeTest
	protected void setUp()
	{
		reader = mock(FileReader.class);
		dao = new AthleteDao(reader);
		pays = new Pays(1,"CH","Suisse");
        sport = new Sport(3,"Jeu de Boule","Petanque");
	}

	@Test
	public void shouldReturnEmptyListWhenArrayEmpty()
	{
		when(reader.readAthletes()).thenReturn(new String[]{});
		List<Athlete> athlete = dao.getListeAthletes(pays,sport);
		assertThat(athlete).isEmpty();
	}


	@Test
	public void shouldReturnSingleListAthleteArrayHasOnline()
	{
		when(reader.readAthletes()).thenReturn(new String[]{ "1;3;8;Teddy;RINNER" });
		List athlete = dao.getListeAthletes(pays,sport);
		assertThat(athlete).isNotEmpty();
		assertThat(athlete).hasSize(1);
		assertThat(athlete).contains(new Athlete(8, "Teddy", "RINNER", pays, sport));
	}


	@Test
	public void shouldReturnDoubleListAthleteArrayHasOnline()
	{
		when(reader.readAthletes()).thenReturn(new String[]{ "1;3;8;Teddy;Rinner","1;3;88;Reddy;Tinner" });
		List athlete = dao.getListeAthletes(pays,sport);
		assertThat(athlete).isNotEmpty();
		assertThat(athlete).hasSize(2);
		assertThat(athlete).contains(new Athlete(88, "Reddy", "Tinner", pays, sport));
		assertThat(athlete).contains(new Athlete(8, "Teddy", "Rinner", pays, sport));
	}

	@Test
	public void shouldReturnWrongCountry()
	{
		when(reader.readAthletes()).thenReturn(new String[]{ "888;3;8;Teddy;Rinner" });
		List athlete = dao.getListeAthletes(pays,sport);
		assertThat(athlete).isEmpty();
	}

	@Test
	public void shouldReturnWrongSport()
	{
		when(reader.readAthletes()).thenReturn(new String[]{ "1;888;8;Teddy;Rinner" });
		List athlete = dao.getListeAthletes(pays,sport);
		assertThat(athlete).isEmpty();
	}

}