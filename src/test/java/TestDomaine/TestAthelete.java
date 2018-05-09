package domaine;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class TestAthelete {

    private Pays pays;
    private Sport sport;


    @BeforeTest
    protected void setUp()
    {
        pays = new Pays(1,"CH","Suisse");
        sport = new Sport(3,"Jeu de Boule","Petanque");
    }

    @Test
    public void testToString() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        String result = instance.toString();
        assertEquals(result, "Teddy RINNER");
    }
  
    @Test
    public void testPrenom() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        String result = instance.getPrenom();
        assertEquals(result, "Teddy");
    }

    @Test
    public void testNom() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        String result = instance.getNom();
        assertEquals(result, "RINNER");
    }

    @Test
    public void testNo() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        int result = instance.getNo();
        assertEquals(result, 8);
    }


    @Test
    public void testPays() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        Pays result = instance.getPays();
        assertEquals(result, new Pays(1,"CH","Suisse"));
    }


    @Test
    public void testSport() {
        Athlete instance = new Athlete(8, "Teddy", "RINNER", pays, sport);
        Sport result = instance.getSport();
        assertEquals(result, new Sport(3,"Jeu de Boule","Petanque"));
    }
}