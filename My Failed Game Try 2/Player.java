import processing.core.*;
import java.util.*;
public class Player{
  public Player(PApplet p){
    this.p = p;
    this.c = p.color(255, 0, 107);
    this.s = 20;
    this.x = 60;
    this.y = p.height - 60;
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
