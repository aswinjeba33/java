import java.util.*;

interface result1 {
 void display(); 
}
interface result2 {
  void display1() 
}
class test1 implements result1, result2 {
 public static void main(String args[]) {
     Test t = new Test();
     t.display();
  }
}
