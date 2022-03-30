import processing.core.*;
import java.util.*;
public class Phi2 extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    background(0);
    blocks = new ArrayList<Block>();
    blocks.add(new Block(this, 0, 0));
    map[1][1]= 1;
  }
  public void draw(){
    if(keyPressed){
      if(key == 'n'){
        drawOne();
        delay(70);
      }
    }
  }
  public void drawOne(){
    for(int i = map.length-1; i >0 ; i--){
      for(int j = map[i].length-1; j >0 ; j--){
        if(map[i][j] == 1){
          if(i >= maxI){
            maxI = i;
          }
          map[j+maxI][i] = 1;
        }
      }
    }
    for(int i = 0; i < map.length; i++){
      for(int j = 0; j < map[i].length; j++){
        if(map[i][j] == 1){
          blocks.add(new Block(this, (i-1)*5, (j-1)*5));
        }
      }
    }
    for(Block b : blocks){
      b.display();
    }
  }
  public static void main(String[] args){
    PApplet.main("Phi2");
  }
  private ArrayList<Block> blocks;
  private int[][] map= new int[280][160];
  private int maxI= 0;
}
