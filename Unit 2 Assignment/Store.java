public class Store{
  public static void main(String[] args){
    testGoodDeal(10, 8, false);
    testGoodDeal(10, 6, true);
    testGoodDeal(10, 7.5, true);
  }
  public static boolean goodDeal(double originalPrice, double salePrice){
    if(originalPrice*3 >= salePrice*4){
      return true;
    }else{
      return false;
    }
  }
  public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
    boolean result = goodDeal(originalPrice, salePrice);
    if(result == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
