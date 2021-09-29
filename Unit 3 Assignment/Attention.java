public class Attention{
  public static void main(String[] args){
    testAttention("Hey you! GO DO YOUR HOMEWORK RIGHT NOW");
    testAttention("hi Dr. Kessner how are you :D");
    testAttention("Hey you! Ranboo");
  }
  public static boolean attention(String n){
    if(n.substring(0, 8).equals("Hey you!")){
      return true;
    }else{
      return false;
    }
  }
  public static void testAttention(String n){
    System.out.println(attention(n));
  }
}
