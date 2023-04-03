public class SchlangeMitArray implements Schlange{
  private int maxGroesse;
  int[] array;
  private int current_size;

  public SchlangeMitArray(int a) {
    this.maxGroesse = a;
    this.array = new int[this.maxGroesse];
    this. current_size = -1;
  }

  public boolean isEmpty() {
    if (current_size < 0) {
      return true;
    }
    return false;
  }

  public int size() {
    return current_size + 1;
  }

  public int capacity() {
      return maxGroesse;
  }

  public void insert(int element) {
    if (this.current_size >= this.maxGroesse -1) {
      throw new java.lang.IllegalStateException();
    }
    ++this.current_size;
    this.array[current_size] = element;
  }

  public void remove() {
    if (this.isEmpty()) {
      throw new java.util.NoSuchElementException();
    }
    for (int i = 0; i < array.length -1; ++i ) {
      int q = this.array[i + 1];
      this.array[i] = q;
    }
    --this.current_size;

  }

  public int front() {
    if (this.isEmpty()) {
      throw new java.util.NoSuchElementException();
    }
    return this.array[0];
  }
}

