public class Boxer extends Person{
  private int weight;
  
  public Boxer(String name, String vorname, int weight) {
    super(name, vorname);
    this.weight = weight;
  }

  public int getGewicht(){
    return this.weight;
  }

  public String toString() {
    return super.toString() + " " + weight;
  }

  public boolean equals(Object o) {
    if (!(o instanceof Student)) {
      return false;
    }
    Boxer b = (Boxer)o;
    Person p = (Person)o;
    if (super.equals(p) & this.weight == b.weight) {
      return true;
    }
    return false;
  }
}
