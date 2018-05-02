package domaine;

public class Pays {
    private int no;
    private String code;
    private String nom;
    
    public Pays(int no, String code, String nom) { this.no=no; this.code=code; this.nom=nom; }
    public Pays(int no) { this(no, "", ""); }
    public Pays() { }    

    public int getNo() { return no; }
    public String getCode() { return code; }
    public String getNom() { return nom; }
    
    public void setNo(int noSet) { this.no = noSet;}
    public void setCode(String codeSet) { this.code = codeSet;}
    public void setNom(String nomSet) { this.nom = nomSet;}
    public void setPays(int noSet, String codeSet, String nomSet) { this.no=noSet; this.code=codeSet; this.nom=nomSet; }
    
    public boolean equals(Object obj) { return this.no == ((Pays)obj).no; }
    public String toString() { return nom; }
}