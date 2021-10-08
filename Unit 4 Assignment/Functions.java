public class Functions{
  public static void main(String[] args){
    testSumOfSquares(1, 1);
    testSumOfSquares(7, 140);

    testCountOccurrences("catatattatatattat", "at", 7);
    testCountOccurrences("hiwhoeverisreadingthis", "e", 3);

    testReverse("racecar", "racecar");
    testReverse("lehcar", "rachel");

    testFactorial(0, 1);
    testFactorial(1, 1);
    testFactorial(2, 2);
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
    System.out.print("sumOfSquares: ");
    System.out.print("input: "+n);
    System.out.print(" expected: "+ expected);
    if(result == expected){
      System.out.println(" true");
    }else{
      System.out.println(" false");
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
    System.out.print("CountOccurrences: ");
    System.out.print("input: "+str + " input: "+s);
    System.out.print(" expected: "+ expected);
    if(result == expected){
      System.out.println(" true");
    }else{
      System.out.println(" false");
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
    System.out.print("reverse: ");
    System.out.print("input: "+str);
    System.out.print(" expected "+ expected);
    String result = reverse(str);
    if(result.equals(expected)){
      System.out.println(" true");
    }else{
      System.out.println(" false");
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
    System.out.print("factorial");
    System.out.print("input: "+n);
    System.out.print(" expected: "+ expected);
    int result = factorial(n);
    if(result == expected){
      System.out.println(" true");
    }else{
      System.out.println(" false");
    }
  }
}
