public class Fibonacci{
  public static void main(String[] args){
    int a = 1;
    int b = 1;
    for(int i = 0; i<20; i++){
     System.out.println(a);
     System.out.println(b);
     a = a+b;
     b = a+b;
   }

  }
}
