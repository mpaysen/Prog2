import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchlangeMitArrayTest {
  SchlangeMitArray f = null;
  static Integer ai[] = {1,2,3,4,5};

  @BeforeEach
  void setup() {
    f = new SchlangeMitArray(5);
  }

  @AfterEach
  void teardown() {
    f=null;
  }

  @Test
  void testPushPop() {
    for (Integer i : ai) {
      f.insert(i);
      assertEquals(i, f.front(), "insert ist falsch");
      f.remove();
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

  
}
