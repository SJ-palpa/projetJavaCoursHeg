package domaine;
import org.joda.time.DateTime;

public class Contrat {

	private int no;
	private int dateMois;
	private String nom;
	private DateTime dt = new DateTime();

	public Contrat(int no, String nom) { this.no=no; this.dateMois=dt.getDayOfMonth(); this.nom=nom;}

	public int getNo() { return no; }
    public int getDateMois() { return dateMois; }
	public String getNom() { return nom; }

	public String toString() { return nom; }
}