package domaine;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.joda.time.DateTime;

public class TestContrat{
 	

    @Test
    public void testGetDateMois() {
       DateTime dt = new DateTime();
        Contrat instance = new Contrat(1,"Bonjour");
        int result = instance.getDateMois();
        assertEquals(result, dt.getDayOfMonth());
    }

    @Test
    public void testGetNom() {
       DateTime dt = new DateTime();
        Contrat instance = new Contrat(1,"Bonjour");
        String result = instance.getNom();
        assertEquals(result, "Bonjour");
    }

    @Test
    public void testToString() {
       DateTime dt = new DateTime();
        Contrat instance = new Contrat(1,"Bonjour");
        String result = instance.toString();
        assertEquals(result, "Bonjour");
    }

    @Test
    public void TestContratIni() {
        DateTime dt = new DateTime();
        Contrat instance = new Contrat(1,"Bonjour");
        int result = instance.getNo();
        assertEquals(result, 1);
    }

}