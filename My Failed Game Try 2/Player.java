import processing.core.*;
import java.util.*;
public class Player{
  public Player(PApplet p){
    this.p = p;
    this.c = p.color(255, 0, 107);
    this.s = 40;
    this.x = 120;
    this.y = p.height - 120;
    this.vx = 0;
    this.vy = 0;
    this.isInsideABlock = false;
    this.howMuchInside = 0;
    this.passed = false;
    this.poisoned = false;
  }
  public void display(ArrayList<Block> blocks, ArrayList<Exit> exits){
    p.fill(c);
    p.rectMode(p.CENTER);
    p.rect(x, y, s, s);

    isInsideABlock = false;
    for(Block b : blocks){
      if(b.isInside(x+vx, y+vy)){
        isInsideABlock = true;
        if(b.getPoison()){
          poisoned = true;
        }else{
          poisoned = false;
        }
      }
    }
    if(isInsideABlock == true){

    }else{
      x += vx*3;
      y += vy*3;
    }

    for(Exit e : exits){
      if(e.isInside(x, y)){
        passed = true;
      }
    }

  }
  public void setVX(float n){
    vx = n;
  }
  public void setVY(float n){
    vy = n;
  }
  public float getVX(){
    return vx;
  }
  public float getVY(){
    return vy;
  }
  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }
  public void setX(float n){
    x = n;
  }
  public void setY(float n){
    y = n;
  }

  private PApplet p;
  private int c;
  private float s;
  private float x;
  private float y;
  private float vx;
  private float vy;
  private boolean isInsideABlock;
  private float howMuchInside;
  public boolean passed;
  public boolean poisoned;
}
