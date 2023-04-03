public class Lamda {

  public static void main(String[] args) {

    //PrintNumberClass pno = new PrintNumberClass();
    //doSomething(pno);
    doSomething( 
      () -> {System.out.println("LambdaFunction: (no arg)");}
      );
    //doSomething( (int i) -> {System.out.println("LambdaFunction:"+i);});
  }
  

static void doSomething(PrintNumberIF obj) {
  obj.printNumber();
  //obj.printInt(7);
}

}


