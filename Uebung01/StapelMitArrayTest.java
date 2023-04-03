import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StapelMitArrayTest {
  StapelMitArray f = null;
  static Integer ai[] = {1,2,3,4,5};

  @BeforeEach
  void setup() {
    f = new StapelMitArray(5);
  }

  @AfterEach
  void teardown() {
    f=null;
  }

  @Test
  void testPushPop() {
    for (Integer i : ai) {
      f.insert(i);
      assertEquals(i, f.top(), "insert ist falsch");
    }
  }

  @Test 
  void testSizeCapacity() {
    int s = 0;
    for (Integer i : ai) {
      assertEquals(f.size(), s, "Größe stimmt nicht");
      assertEquals(f.capacity(), f.array.length, "Kapazität ist falsch");
      f.insert(i);
      s++;
    }
  }

  @Test
  void testPosition() {
    int p = 0;
    for(Integer i: ai) {
      f.insert(i);
      assertEquals(f.array[p], ai[p], "hier stimmt was nicht");
      p++;
    }
  }

  //teste auf Exception (NoSuchElementException)
  @Test
  void testInsertNSE() {
    assertThrows(java.util.NoSuchElementException.class, 
    () -> f.remove(), 
    "no NSE?");
  }

  //teste auf Exception (IllegalStateException)
  @Test
  void testInsertISE() {
    for (Integer i : ai) {
      f.insert(i);
    }
    assertThrows(IllegalStateException.class, 
    () -> f.insert(1), 
    "no NSE?");
  }

  @Test
  void testApplyToAllt2() {
    for (Integer i : ai) {
      f.insert(i);
    }
    f.applyToAll(
      (int q) -> {return (q * 2);}
      );

    for (int i = f.array.length -1; i >= 0; --i) {
      assertEquals(ai[i] * 2, f.top(), "applyToAll * 2 ist falsch");
      f.remove();
    }
  }

  @Test
  void testApplyToAllp2() {
    for (Integer i : ai) {
      f.insert(i);
    }
    f.applyToAll(
      (int q) -> {return (q * q);}
      );

    for (int i = f.array.length -1; i >= 0; --i) {
      assertEquals(ai[i] * ai[i], f.top(), "applyToAll pow 2 ist falsch");
      f.remove();
    }
  }

  
}
