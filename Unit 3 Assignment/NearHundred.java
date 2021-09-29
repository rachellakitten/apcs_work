public class NearHundred{
  public static void main(String[] args){
    testNearHundred(93, true);
    testNearHundred(90, true);
    testNearHundred(89, true);
  }
  public static boolean nearHundred(int n) {
  if(Math.abs(100-n) <= 10|| Math.abs(200-n) <= 10){
    return true;
  }else{
    return false;
  }
  }
  public static void testNearHundred(int n, boolean expected){
    System.out.println("input: " + n);
    System.out.println("expected: " + expected);

    if(nearHundred(n) == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
