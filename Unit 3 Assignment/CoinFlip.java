public class CoinFlip{
  public static void main(String[] args){
    for(int i = 0; i < 15; i++){
      System.out.println(flip());
    }
  }
  public static String flip(){
    if(Math.random() <0.5){
      return "heads";
    }else{
      return "tails";
    }
  }
}
