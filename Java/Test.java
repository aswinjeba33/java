import java.util.*;

class result1 {
 void display() {
System.out.println("result1");
  }
}
class result2 {
  void display() {
    System.out.println("result2");
  }
}
class Test extends result1, result2 {
 public static void main(String args[]) {
     Test t = new Test();
     t.display();
  }
}
