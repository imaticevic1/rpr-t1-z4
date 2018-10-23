package ba.unsa.etf.rpr.Tutorijal1;
public class Program {
    public static void main(String[] args) {
        try{
        Predmet predmet = new Predmet("RPR", 132, 3);
        Student s1 = new Student("Matko", "Polovina", 1234);
        Student s2 = new Student("Karlo", "Karlovic", 4321);
        Student s3 = new Student("Ranko", "Zvrko", 3214);
        Student s4 = new Student("Mario", "Maric", 2134);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            predmet.upisiStudenta(s1);
            predmet.upisiStudenta(s2);
            predmet.upisiStudenta(s3);
            predmet.ispisiSpisakStudenata();
            predmet.ispisiStudenta(s1);
            predmet.upisiStudenta(s4);
            predmet.ispisiSpisakStudenata();
            predmet.ispisiStudenta(s1);
        }
        catch(SecurityException a){
            System.out.println(a.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException f){
            System.out.println(f.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(UnsupportedOperationException b){
            System.out.println(b.getMessage());
        }
        catch(NullPointerException g){
            System.out.println(g.getMessage());
        }


    }
}