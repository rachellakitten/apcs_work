import processing.core.*;
public class Player{
  public Player(PApplet p){
    this.p = p;
    this.c = p.color(255, 0, 107);
    this.s = 30;
    this.x = 60;
    this.y = p.height - 60;
    this.vx = 0;
    this.vy = 0;
  }
  public void display(){
    p.fill(c);
    p.rect(x, y, s, s);
    x += vx;
    y += vy;
  }
  public void setVX(int n){
    vx = n;
  }
  public void setVY(int n){
    vy = n;
  }

  private PApplet p;
  private int c;
  private float s;
  private float x;
  private float y;
  private int vx;
  private int vy;
}
