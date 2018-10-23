package ba.unsa.etf.rpr.Tutorijal1;
public class Predmet {
    private Student[] studenti;
    private String NazivPredmeta;
    private int SifraPredmeta, maksBrojStudenata;

    public Predmet(String nazivPredmeta, int sifraPredmeta, int maksBrojStudenata) {
        studenti = new Student[maksBrojStudenata];
        for(int i = 0; i < maksBrojStudenata; i++)
            studenti[i] = null;
        NazivPredmeta = nazivPredmeta;
        SifraPredmeta = sifraPredmeta;
        this.maksBrojStudenata = maksBrojStudenata;
    }

    public String getNazivPredmeta() {
        return NazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        NazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return SifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        SifraPredmeta = sifraPredmeta;
    }

    public int getMaksBrojStudenata() {
        return maksBrojStudenata;
    }
    public void upisiStudenta(Student s){
        if(maksBrojStudenata == 0) throw new ArrayIndexOutOfBoundsException
                                    ("Predmet ne prima nijednog studenta!");
        int i = 0;
        for(; i < maksBrojStudenata; i++)
            if(studenti[i] == null) break;
        if(i == maksBrojStudenata) throw new IndexOutOfBoundsException("Predmet popunjen!");
        studenti[i] = s;
    }
    public void ispisiStudenta(Student s) {
        for (int i = 0; i < maksBrojStudenata; i++)
            if ((studenti[i].getIme()).equals(s.getIme()) && (studenti[i].getPrezime()).equals(s.getPrezime())
                    && studenti[i].getBrojIndeksa() == s.getBrojIndeksa()) {
                studenti[i] = null;
                break;
            }
    }
    public void ispisiSpisakStudenata() {
        if(this == null) throw new NullPointerException("Nema upisanih studenata!");
        int nijeNull = 0;
        for(int i = 0; i < maksBrojStudenata; i++) {
            if(studenti[i] != null) {
                System.out.print(nijeNull + 1 + "." + " ");
                System.out.println(studenti[i]);
                nijeNull++;
            }
        }
    }
    public static void main(String[] args) {
    }
}