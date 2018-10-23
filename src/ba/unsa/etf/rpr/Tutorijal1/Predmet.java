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
    public boolean provjeriStudenta(Student s){
        if(maksBrojStudenata == 0) return false;
        for(int i = 0; i < maksBrojStudenata; i++)
            if(studenti[i] != null)
            if ((studenti[i].getIme()).equals(s.getIme()) && (studenti[i].getPrezime()).equals(s.getPrezime())
                    && studenti[i].getBrojIndeksa() == s.getBrojIndeksa())
                return true;
            return false;
    }
    public void upisiStudenta(Student s){
        if(maksBrojStudenata == 0) throw new ArrayIndexOutOfBoundsException
                                    ("Predmet ne prima nijednog studenta!");
        if(this.provjeriStudenta(s)) throw new SecurityException("Student je vec upisan!");
        int i = 0;
        for(; i < maksBrojStudenata; i++)
            if(studenti[i] == null) break;
        if(i == maksBrojStudenata) throw new IndexOutOfBoundsException("Predmet popunjen!");
        studenti[i] = s;
    }
    public void ispisiStudenta(Student s) {
        if(!this.provjeriStudenta(s) || this == null) throw new UnsupportedOperationException("Student nije ni upisan");
        for (int i = 0; i < maksBrojStudenata; i++)
            if ((studenti[i].getIme()).equals(s.getIme()) && (studenti[i].getPrezime()).equals(s.getPrezime())
                    && studenti[i].getBrojIndeksa() == s.getBrojIndeksa()) {
                studenti[i] = null;
                break;
            }
    }
    public void ispisiSpisakStudenata() {
        boolean imaIh = false;
        for(int i = 0; i < maksBrojStudenata; i++)
            if(studenti[i] != null){
                imaIh = true;
                break;
            }
            if(!imaIh)throw new NullPointerException("Nema upisanih studenata!");

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