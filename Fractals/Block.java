import processing.core.*;
public class Block{
  public Block(PApplet p, float x, float y){
    this.p = p;
    this.x = x;
    this.y = y;
  }
  public void display(){
    p.rectMode(p.CORNER);
    p.fill(255, 255, 255);
    p.rect(x, y, 5, 5);
  }
  private PApplet p;
  private float x;
  private float y;
}
