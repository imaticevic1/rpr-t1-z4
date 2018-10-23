package ba.unsa.etf.rpr.Tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void setIme() {
        Student s = new Student("Ivo", "Ivic", 1327);
        s.setIme("Rado");
        assertEquals("Rado", s.getIme());
    }

    @Test
    void setPrezime() {
        Student s = new Student("Ivo", "Ivic", 1327);
        s.setPrezime("Rado");
        assertEquals("Rado", s.getPrezime());
    }

    @Test
    void setBrojIndeksa() {
        Student s = new Student("Ivo", "Ivic", 1327);
        s.setBrojIndeksa(4756);
        assertEquals(4756, s.getBrojIndeksa());
    }

    @Test
    void getIme() {
        Student s = new Student("Ivo", "Ivic", 1327);
        assertEquals("Ivo", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("Ivo", "Ivic", 1327);
        assertEquals("Ivic", s.getPrezime());
    }

    @Test
    void getBrojIndeksa() {
        Student s = new Student("Ivo", "Ivic", 4756);
        assertEquals(4756, s.getBrojIndeksa());
    }
}