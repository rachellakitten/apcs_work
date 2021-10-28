import processing.core.*;
public class Player{
  public Player(PApplet p){
    this.p = p;
    this. c = p.color(255, 0, 107);
    this.s = 30;
  }
  public void display(){
    p.fill(c);
    p.rect(30, 30, s, s);
  }
  public void keyPressed(){

  }
  private PApplet p;
  private int c;
  private float s;
}
