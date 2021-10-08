public class StringTimes{
  public static void main(String[] args){
    testStringTimes("Hi", 2, "HiHi");
    testStringTimes("Cat", 3, "CatCatCat");
    testStringTimes("zero", 0, "");
  }
  public static String stringTimes(String str, int n) {
    String hi = "";
    for(int i = 0; i < n; i++){
      hi += str;
    }
      return hi;
  }
  public static void testStringTimes(String str, int n, String expected){
    String result = stringTimes(str, n);
    System.out.print("Input: "+ str + " Input: "+ n + "Expected: "+ expected);
    if(expected.equals(result)){
      System.out.println(" True");
    }else{
      System.out.println(" False");
    }
  }
}
