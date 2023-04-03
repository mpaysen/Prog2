public class Student extends Person{
  private int matrikelNr;
  
  public Student(String name, String vorname, int matrikelNr) {
    super(name, vorname);
    this.matrikelNr = matrikelNr;
  }

  public int getMatrikel(){
    return matrikelNr;
  }

  public String toString() {
    return super.toString() + " " + matrikelNr;
  }

  public boolean equals(Object o) {
    if (!(o instanceof Student)) {
      return false;
    }
    Student s = (Student)o;
    Person p = (Person)o;
    if (super.equals(p) & this.matrikelNr == s.matrikelNr) {
      return true;
    }
    return false;
  }
}
