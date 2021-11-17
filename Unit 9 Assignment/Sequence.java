import java.util.*;
public class Sequence{
  public static ArrayList<Integer> fibonacci(int n){
    ArrayList<Integer> result = new ArrayList<Integer>();
    int a = 1;
    int b = 1;
    for(int i = 0; i < n/2; i++){
     result.add(a);
     result.add(b);
     a = a+b;
     b = a+b;
   }
   return result;
  }
  public static void main(String[] args){
    for(int i = 0; i < fibonacci(8).size(); i++){
      System.out.println(fibonacci(8).get(i));
    }
  }
}
