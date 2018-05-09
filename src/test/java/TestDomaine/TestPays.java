package domaine;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestPays {
 	

 	@Test
    public void testPaysCode() {
        Pays instance = new Pays(1);
        int result = instance.getNo();
        assertEquals(result, 1);
    }

 	@Test
    public void testGetCode() {
        Pays instance = new Pays(1,"FR", "france");
        String result = instance.getCode();
        assertEquals(result, "FR");
    }

     @Test
    public void testToString() {
        Pays instance = new Pays(1,"FR", "france");
        String result = instance.toString();
        assertEquals(result, "france");
    }
  
    @Test
    public void testGetNom() {
        Pays instance = new Pays(1,"FR", "france");
        String result = instance.getNom();
        assertEquals(result, "france");
    }

    @Test
    public void testGetNo() {
        Pays instance = new Pays(1,"FR", "france");
        int result = instance.getNo();
        assertEquals(result, 1);
    } 

    @Test
    public void testSetCode() {
        Pays instance = new Pays(1,"FR", "france");
        instance.setCode("CH");
        String result = instance.getCode();
        assertEquals(result, "CH");
    }

    @Test
    public void testSetNo() {
        Pays instance = new Pays(1,"FR", "france");
        instance.setNo(3);
        int result = instance.getNo();
        assertEquals(result, 3);
    } 

    
    @Test
    public void testSetNom() {
        Pays instance = new Pays(1,"FR", "france");
        instance.setNom("Suisse");
        String result = instance.getNom();
        assertEquals(result, "Suisse");
    }


    @Test
    public void testSetPays() {
        Pays instance = new Pays(1,"FR", "france");
        Pays instanceVerification = new Pays(3,"CH","Suisse");
        instance.setPays(3,"CH","Suisse");
        assertEquals(instance, instanceVerification);
    }

}