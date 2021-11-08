import processing.core.*;
import java.util.*;
public class Game extends PApplet{
  public void settings(){
    size(1410, 810);
  }
  public void setup(){
    int[][] block = {{0, 1, 0, 0, 1},
                      {0, 1, 1, 0, 0},
                      {0, 1, 0, 1, 0},
                      {0, 1, 1, 1, 1}
                    };
    p = new Player(this);
    blocks = new ArrayList<Block>();

    /*for(int i = 0; i < this.height; i+=30){
      blocks.add(new Block(this, 0, i));
    }
    for(int i = 0; i < this.width; i+=30){
      blocks.add(new Block(this,i, 0));
    }*/
    for(int i = 0; i < this.height; i+=30){
      blocks.add(new Block(this, 15, i-15));
    }
    for(int i = 0; i < this.width; i+=30){
      blocks.add(new Block(this,i-15, 15));
    }
    for(int i = 0; i < this.width; i+=30){
      blocks.add(new Block(this,i-15, this.height-15));
    }
    for(int i = 0; i < this.height+30; i+=30){
      blocks.add(new Block(this, width - 15, i-15));
    }
    for(int i = 0; i < block.length; i++){
      for(int j = 0; j < block[i].length; j++){
        int x = 30*j;
        int y = 30*i;
        if(block[i][j] == 1){
          blocks.add(new Block(this, x+15, y+15));
        }
      }
    }
  }
  public void draw(){
    background(0);
    p.display(blocks);
    for(Block b : blocks){
      b.display();
    }

  }
  public void keyPressed(){
    if(key == 'w'){
      up = true;
    }else if(key == 'a'){
      left = true;
    }else if(key == 's'){
      down = true;
    }else if(key == 'd'){
      right = true;
    }

    if(up == true && down == false){
      p.setVY(-10);
    }else if(down == true && up == false){
      p.setVY(10);
    }else if(left == true && right == false){
      p.setVX(-10);
    }else if(right == true && left == false){
      p.setVX(10);
    }
  }
  public void keyReleased(){
    if(key == 'w'){
      up = false;
    }else if(key == 'a'){
      left = false;
    }else if(key == 's'){
      down = false;
    }else if(key == 'd'){
      right = false;
    }
    if(up == false && down == false){
      p.setVY(0);
    }
    if(left == false && right == false){
      p.setVX(0);
    }
  }
  public static void main(String[] args){
    PApplet.main("Game");
  }
  private Player p;
  private ArrayList<Block> blocks;
  private boolean up = false;
  private boolean down = false;
  private boolean left = false;
  private boolean right = false;
}
