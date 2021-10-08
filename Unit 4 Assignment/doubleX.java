public class doubleX{
  public static void main(String[] args){
    testDoubleX("axxbadfiuasdolhuf", true);
    testDoubleX("xxKittensarecutex x x", true);
    testDoubleX("welovecats", false);
  }
  public static boolean doubleX(String str) {
    int spot = str.indexOf("x", 0);
    if(spot == str.length()-1){
      return false;
    }else if(str.substring(spot+1, spot+2).equals("x")){
      return true;
    }else{
      return false;
    }
  }
  public static void testDoubleX(String str, boolean expected){
    boolean result = doubleX(str);
    System.out.print("Input: "+str +" Expected: "+ expected);
    if(result == expected){
      System.out.println(" true");
    }else{
      System.out.println(" false");
    }
  }
}
