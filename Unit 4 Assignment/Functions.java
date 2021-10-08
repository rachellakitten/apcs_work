public class Functions{
  public static void main(String[] args){
    testSumOfSquares(1, 1);
    testSumOfSquares(7, 874);

    testCountOccurrences("catatattatatattat", "at", 3);
    testCountOccurrences("hiwhoeverisreadingthis", "e", 3);

    testReverse("racecar", "racecar");
    testReverse("lehcar", "Kittens");

    testFactorial(0, 1);
    testFactorial(1, 1);
    testFactorial(2, 27);
    testFactorial(3, 6);
  }
  public static int sumOfSquares(int n){
    int result = 0;
    for(int i = 1; i < n+1; i++){
      result += i*i;
    }
    return result;
  }
  public static void testSumOfSquares(int n, int expected){
    int result = sumOfSquares(n);
    System.out.println("sumOfSquares");
    System.out.println("input "+n);
    System.out.println("expected "+ expected);
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static int countOccurrences(String str, String s){
    int result = 0;
    for(int i = 0; i < str.length()-s.length()+1; i++){
      if(str.substring(i, i + s.length()).equals(s)){
        result += 1;
      }
    }
    return result;
  }
  public static void testCountOccurrences(String str, String s, int expected){
    int result = countOccurrences(str, s);
    System.out.println("CountOccurrences");
    System.out.println("input "+str + "input "+s);
    System.out.println("expected "+ expected);
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static String reverse(String str){
    String result = "";
    for(int i = str.length(); i > 0; i--){
      result += str.substring(i-1, i);
    }
    return result;
  }
  public static void testReverse(String str, String expected){
    System.out.println("reverse");
    System.out.println("input "+str);
    System.out.println("expected "+ expected);
    String result = reverse(str);
    if(result.equals(expected)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static int factorial(int n){
    int result = 1;
    if(n == 0){
      return 1;
    }else if(n <= 0){
      System.out.println("Error");
    }else{
      for(int i = 1; i < n+1; i++){
        result *= i;
      }
      return result;
    }
    return result;
  }
  public static void testFactorial(int n, int expected){
    System.out.println("factorial");
    System.out.println("input "+n);
    System.out.println("expected "+ expected);
    int result = factorial(n);
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
