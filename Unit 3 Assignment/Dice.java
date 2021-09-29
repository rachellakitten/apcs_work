public class Dice{
  public static void main(String[] args){
    for(int i = 0; i < 15; i++){
      System.out.println(dice());
    }
  }
  public static int dice(){
    return((int)(Math.random()*6+1));
  }
}
