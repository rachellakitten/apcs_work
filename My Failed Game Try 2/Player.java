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
  }

  public void display(ArrayList<Block> blocks){
    p.fill(c);
    p.rectMode(p.CENTER);
    p.rect(x, y, s, s);

    isInsideABlock = false;
    for(Block b : blocks){
      if(b.isInside(x+vx, y+vy)){
        isInsideABlock = true;
      }
    }
    if(isInsideABlock == true){

    }else{
      x += vx*2.5;
      y += vy*2.5;
    }

    /*p.noStroke();
    p.fill(153, 76, 0);
    p.rectMode(p.CORNER);
    p.rect(0, 0, x-200, p.height);
    p.rect(x+200, 0, p.width-x-200, p.height);
    p.rect(0, 0, p.width, y-100);
    p.rect(0, y+100, p.width, p.height-y-100);*/

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

  private PApplet p;
  private int c;
  private float s;
  private float x;
  private float y;
  private float vx;
  private float vy;
  private boolean isInsideABlock;
  private float howMuchInside;
}
