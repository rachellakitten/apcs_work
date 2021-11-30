import processing.core.*;
public class Block{
  public Block(PApplet p, float x, float y){
    this.p = p;
    this.c = p.color(153, 76, 0);
    this.x = x;
    this.y = y;
  }
  public void display(){
    p.rectMode(p.CENTER);
    p.fill(c);
    p.rect(x, y, 30, 30);
  }
  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }

  public boolean isInside(float px, float py){
    if(px +10>= this.x-15 && px <= this.x && py +10>= this.y-15 && py <= this.y){
      return true;
    }else if(px +10>= this.x-15 && px <= this.x && py -10<= this.y+15 && py >= this.y){
      return true;
    }else if(px -10<= this.x+15 && px >= this.x && py -10<= this.y+15 && py >= this.y){
      return true;
    }else if(px -10<= this.x+15 && px >= this.x && py +10>= this.y-15 && py <= this.y){
      return true;
    }
    return false;
  }
  private PApplet p;
  private int c;
  private float x;
  private float y;
}
