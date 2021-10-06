public class Functions{
  public static void main(String[] args){
    sumOfSquares(1);
    sumOfSquares(7);

    countOccurrences("catatattatatattat", "at");
    countOccurrences("hiwhoeverisreadingthis", "e");

    reverse("racecar");
    reverse("lehcar");

    factorial(0);
    factorial(1);
    factorial(2);
    factorial(3);
  }
  public static void sumOfSquares(int n){
    int result = 0;
    for(int i = 1; i < n+1; i++){
      result += i*i;
    }
    System.out.println(result);
  }
  public static void countOccurrences(String str, String s){
    int result = 0;
    for(int i = 0; i < str.length()-s.length()+1; i++){
      if(str.substring(i, i + s.length()).equals(s)){
        result += 1;
      }
    }
    System.out.println(result);
  }
  public static void reverse(String str){
    String result = "";
    for(int i = str.length(); i > 0; i--){
      result += str.substring(i-1, i);
    }
    System.out.println(result);
  }
  public static void factorial(int n){
    int result = 1;
    if(n == 0){
      System.out.println("1");
    }else if(n <= 0){
      System.out.println("Error");
    }else{
      for(int i = 1; i < n+1; i++){
        result *= i;
      }
      System.out.println(result);
    }
  }
}
