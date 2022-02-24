import processing.core.*;
public class Block{
  public Block(PApplet p, float x, float y, boolean poison){
    this.p = p;
    this.c = p.color(153, 76, 0);
    this.x = x;
    this.y = y;
    this.poison = poison;
  }
  public void display(){
    p.rectMode(p.CENTER);
    p.fill(c);
    p.rect(x, y, 60, 60);
  }
  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }

  public boolean getPoison(){
    return poison;
  }

  public boolean isInside(float px, float py){
    if(px +20>= this.x-30 && px <= this.x && py +20>= this.y-30 && py <= this.y){
      return true;
    }else if(px +20>= this.x-30 && px <= this.x && py -20<= this.y+30 && py >= this.y){
      return true;
    }else if(px -20<= this.x+30 && px >= this.x && py -20<= this.y+30 && py >= this.y){
      return true;
    }else if(px -20<= this.x+30 && px >= this.x && py +20>= this.y-30 && py <= this.y){
      return true;
    }
    return false;
  }
  private PApplet p;
  private int c;
  private float x;
  private float y;
  private boolean poison;
}
