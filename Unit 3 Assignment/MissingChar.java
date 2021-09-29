public class MissingChar{
  public static void main(String[] args){
    testMissingChar("kitten", 1, "itten");
    testMissingChar("kitten", 1, "ktten");
    testMissingChar("meowmeow", 3, "meomeow");
  }
  public static String missingChar(String str, int n) {
    String a = str.substring(0, n);
    String b = str.substring(n+1, str.length());
    return a + b;
  }
  public static void testMissingChar(String str, int n, String expected){
    System.out.println("string: " + str);
    System.out.println("n: " + n);
    System.out.println("expected: " + expected);

    if(missingChar(str, n).equals(expected)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
