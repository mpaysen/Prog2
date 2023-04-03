import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPerson {
  Person a = null;
  Person b = null;
  Person c = null;
  Person[] p = new Person[3];
  String name = "Karl";
  String vorname = "Gustav";

  @BeforeEach
  void setup() {
    a = new Student(name, vorname, 2345);
    b = new Student(name, vorname, 2345);
    c = new Boxer(name, vorname, 75);
    p[0] = a;
    p[1] = b;
    p[2] = c;
  }

  @AfterEach
  void teardown() {
    a = null;
    b = null;
    c = null;
  }



  @Test  
  void testname() {
    for (Person iterable : p) {
      assertEquals(name, iterable.getName(), "Name ist falsch");
    }
  }

  @Test
  void testVorname() {
    for (Person iterable : p) {
      assertEquals(vorname, iterable.getVorname(), "Vorname ist falsch");
    }
  }

}


