public class doubleX{
  public static void main(String[] args){
    testDoubleX("axxbadfiuasdolhuf", true);
    testDoubleX("xxKittensarecutex x x", true);
    testDoubleX("welovecats", true);
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
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
