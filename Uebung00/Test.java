public class Test {

  public static void main(String[] args) {
    SchlangeMitArray SA = new SchlangeMitArray(2);
    SA.insert(5);
    System.out.println(SA.isEmpty());
    SA.insert(7);
    System.out.println(SA.front());
    SA.remove();
    System.out.println(SA.front());
    SA.insert(3);
    System.out.println(SA.size());
  }
  
}
