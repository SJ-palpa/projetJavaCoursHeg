import domaine.Pays;
import domaine.Sport;
import dao.AthleteDao;
import java.io.File;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;

public class TestMockito {
    
    @InjectMocks public Pays pMock = new Pays();
    @InjectMocks public Sport sMock = new Sport();
    public Pays pays,pays1,pays2;
    ArrayList aLst;

    @BeforeMethod
    public void setup(){
	Pays pays = new Pays();
	MockitoAnnotations.initMocks(this);
	//AthleteDao.getListeAthletes(pMock, sMock);	
        Pays pays1 = new Pays(1,"fr", "France");
        Pays pays2 = new Pays(2,"ch", "Suisse");
    }

    

    @DataProvider(name = "data")
    public Object[][] data() {
        Object[][] data = new Object[3][3];
        data[0] = new Object[] { 3, "it", "Italie" };
        data[1] = new Object[] { 4, "de", "Allemagne" };
        data[2] = new Object[] { 5, "en", "Royaume Uni" };
        return data;
    }

   

    @Test(dataProvider = "data")
    public void newPays_should_newPays(int i, String j, String k) {
	Pays pays = new Pays(i,j,k);
        Assert.assertEquals(pays.getNom(), k);
	
    }

    @Test
    public void testMock() {
        //when(aLst.get()).thenReturn("");
    }
   


/*
    Je comprend pas trop pourquoi ça ne fonctionne pas

    @Test
    public void testCreation() {
        Assert.assertEquals(pays1.getNom(),"France");	
    }

    @DataProvider(name = "dataSet")
    public Object[][] dataSet() {
        Object[][] dataSet = new Object[3][1];
        dataSet[0] = new Object[] { "Italie2" };
        dataSet[1] = new Object[] { "Allemagne2" };
        dataSet[2] = new Object[] { "Royaume Uni2" };
        return dataSet;
    }
 

    @Test(dataProvider = "dataSet")
    public void setPays_should_setPays(String k) {
        pays.setNom(k);
        Assert.assertEquals(pays.getNom(), k);
    }
*/
}
