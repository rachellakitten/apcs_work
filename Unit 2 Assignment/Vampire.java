public class Vampire{
  public static void main(String[] args){
    testIsVampire(6, true, false);
    testIsVampire(7, false, true);
  }
  public static boolean isVampire(float hour, boolean awake){
    if(awake){
      if(6 > hour || hour > 22){
        return true;
      }else{
        return false;
      }
    }else{
      if(6 > hour || hour > 22){
        return false;
      }else{
        return true;
      }
    }
  }
  public static void testIsVampire(float hour, boolean awake, boolean expected){
    boolean result = isVampire(hour, awake);
    if(expected == result){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
