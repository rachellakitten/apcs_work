import processing.core.*;
public class Block{
  public Block(PApplet p){
    this.p = p;
    this.c = p.color(0);

  }
  private PApplet p;
  private color c;
  private float x;
  private float y;
}
