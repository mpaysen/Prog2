abstract class Person {
  private String name;
  private String vorname;

  public Person(String name, String vorname) {
    this.name = name;
    this.vorname = vorname;
  }

  public String getName() {
    return this.name;
  }

  public String getVorname() {
    return this.vorname;
  };

  public String toString(){
    return "<" + this.name + ">,<" + this.vorname + ">";
  }

  public boolean equals(Object o) {
    if (!(o instanceof Person)) {
      return false;
    }
    Person p = (Person)o;
    if (this.name.equals(p.name) & this.vorname.equals(p.vorname)) {
      return true;
    }
    return false;
  }

}