public class StapelMitArray implements Stapel{
  private int maxGroesse;
  int[] array;
  private int current_size;

  public StapelMitArray(int a) {
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
    --this.current_size;

  }

  public int top() {
    if (this.isEmpty()) {
      throw new java.util.NoSuchElementException();
    }
    return this.array[current_size];
  }

  public void applyToAll(Funktion f) {
    for (int i = 0; i < array.length; ++i){
      array[i] = f.auswerten(array[i]);
    }
  }

}
