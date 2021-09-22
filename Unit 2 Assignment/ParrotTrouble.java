public class ParrotTrouble{
  public static void main(String[] args){
    testParrotTrouble(true, 6, true);
    testParrotTrouble(true, 7, false);
    testParrotTrouble(false, 6, false);
  }
  public static boolean parrotTrouble(boolean talking, int hour) {
    if(talking == false){
      return false;
    }else{
      if(20 < hour || 7 > hour){
        return true;
      }else{
        return false;
      }
  }

  }
  public static void testParrotTrouble(boolean talking, int hour, boolean expected){
    boolean result = parrotTrouble(talking, hour);
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }

}
}
