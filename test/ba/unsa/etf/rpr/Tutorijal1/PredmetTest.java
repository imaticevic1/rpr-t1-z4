package ba.unsa.etf.rpr.Tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta() {
        assertEquals("Biologija", new Predmet("Biologija",
                132, 9).getNazivPredmeta());
    }

    @Test
    void setNazivPredmeta() {
        Predmet predmet1 = new Predmet("Biologija", 132, 9);
        predmet1.setNazivPredmeta("Razvoj programskih rješenja");
        assertEquals("Razvoj programskih rješenja", predmet1.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        assertEquals(132, new Predmet("Biologija",
                132, 9).getSifraPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet predmet1 = new Predmet("Psihologija", 142, 3);
        predmet1.setSifraPredmeta(123);
        assertEquals(123, predmet1.getSifraPredmeta());
    }

    @Test
    void getMaksBrojStudenata() {
        assertEquals(13, new Predmet("Biologija",
                132, 13).getMaksBrojStudenata());
    }

    @Test
    void upisiStudenta() {
        Predmet predmet2 = new Predmet("Programiranje", 142, 0);
        Student s = new Student("Marko", "Markioli", 5748);
        assertThrows(IndexOutOfBoundsException.class, ()->{predmet2.upisiStudenta(s);});
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->{predmet2.upisiStudenta(s);});
    }
    @Test
    void ispisiStudenta() {
        Predmet predmet2 = new Predmet("Programiranje", 142, 3);
        Student s = new Student("Marko", "Markioli", 5748);
        assertThrows(NullPointerException.class, ()->{predmet2.ispisiStudenta(s);});
    }

    @Test
    void ispisiSpisakStudenata() {
    }
    @Test
    void main() {
    }
}