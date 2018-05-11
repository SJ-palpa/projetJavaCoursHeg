package dao;


import outils.FileStr;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFileReader {

	private FileStr fileStr;
	private FileReader reader;

	@BeforeTest
	protected void setUp()
	{
		fileStr = mock(FileStr.class);
		reader= mock(FileReader.class);
	}

	@Test
	public void shouldReturnEmptyListWhenArrayEmptyPaysAny()
	{
		when(fileStr.read(anyString())).thenReturn( new String[]{});
		String[] s =  reader.readPays();
		assertThat(s).isEmpty();
	}

	public void shouldReturnEmptyListWhenArrayEmptyPaysFilestr()
	{
		String FICHIER_PAYS = "Pays.txt";
		when(fileStr.read(FICHIER_PAYS)).thenReturn( new String[]{});
		String[] s =  reader.readPays();
		assertThat(s).isEmpty();
	}


	public void shouldReturnSameListAsStringPays()
	{
		String FICHIER_PAYS = "Pays.txt";
		when(fileStr.read(FICHIER_PAYS)).thenReturn( new String[]{"qwertzuiopasdfghjklyxcvbnm+'*ç%&/()=?`ü!öä£M;:_>°§1234567890^è¨éà$,.-<QWERTZUIOPASDFGHJKLYXCVBNM"});
		String[] s =  reader.readPays();
		assertThat(s).contains("qwertzuiopasdfghjklyxcvbnm+'*ç%&/()=?`ü!öä£M;:_>°§1234567890^è¨éà$,.-<QWERTZUIOPASDFGHJKLYXCVBNM");
	}


	@Test
	public void shouldReturnEmptyListWhenArrayEmptyPays()
	{
		when(reader.readPays()).thenReturn(new String[]{});
		String[] s = reader.readPays();
		assertThat(s).isEmpty();
	}



	@Test
	public void shouldReturnEmptyListWhenArrayEmptySport()
	{
		when(reader.readSports()).thenReturn(new String[]{});
		String[] s = reader.readSports();
		assertThat(s).isEmpty();
	}


	@Test
	public void shouldReturnEmptyListWhenArrayEmptyAthlete()
	{
		when(reader.readAthletes()).thenReturn(new String[]{});
		String[] s = reader.readAthletes();
		assertThat(s).isEmpty();
	}



	@Test
	public void shouldReturnStringWhenStringPays()
	{
		when(reader.readPays()).thenReturn(new String[]{"test lire info document Pays 1234 +*ç%&/()=?`"});
		String[] s = reader.readPays();
		assertThat(s).contains("test lire info document Pays 1234 +*ç%&/()=?`");
	}


	@Test
	public void shouldReturnStringWhenStringAthletes()
	{
		when(reader.readAthletes()).thenReturn(new String[]{"test lire info document Athlete 1234 +*ç%&/()=?`"});
		String[] s = reader.readAthletes();
		assertThat(s).contains("test lire info document Athlete 1234 +*ç%&/()=?`");
	}

	@Test
	public void shouldReturnStringWhenStringSports()
	{
		when(reader.readSports()).thenReturn(new String[]{"test lire info document Sports 1234 +*ç%&/()=?`"});
		String[] s = reader.readSports();
		assertThat(s).contains("test lire info document Sports 1234 +*ç%&/()=?`");
	}


}