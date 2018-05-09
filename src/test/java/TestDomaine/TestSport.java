package domaine;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestSport {
 	


 	@Test
    public void testGetNo() {
        Sport instance = new Sport(1, "Petanque","Jeux de Boule");
        int result = instance.getNo();
        assertEquals(result, 1);
    }

    @Test
    public void testToString() {
        Sport instance = new Sport(1, "Petanque","Jeux de Boule");
        String result = instance.toString();
        assertEquals(result, "Petanque");
    }
  
    @Test
    public void testGetCategorie() {
        Sport instance = new Sport(1, "Petanque","Jeux de Boule");
        String result = instance.getCategorie();
        assertEquals(result, "Jeux de Boule");
    }


    @Test
    public void TestSportIniNo() {
        Sport instance = new Sport(1);
        int result = instance.getNo();
        assertEquals(result, 1);
    }

    @Test
    public void TestSportIni() {
        Sport instance = new Sport();
        int result = instance.getNo();
        assertEquals(result, 0);
    }

}