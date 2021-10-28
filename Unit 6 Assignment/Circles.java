import processing.core.*;

public class Circles{
  public Circles(PApplet p){
    this.p = p;
    this.x = p.random(0, p.width);
    this.y = p.random(0, p.height);
    this.originX = p.random(400, p.width-400);
    this.originY = p.random(400, p.height-400);
    this.r = Math.sqrt((originX-x)*(originX-x)-(originY-y)*(originY-y));
    this.angle = 0;
    this.expiration = p.millis()+ 7000;
    this.alive = true;
  }
  void display(){
    p.noStroke();
    p.colorMode(p.HSB, 100);
    float value = p.map((float)angle%(float)(2*Math.PI), 0, 2*(float)Math.PI, 0, 100);
    p.fill(value, 100, 100);
    p.ellipse((float)x, (float)y, 50, 50);

    x = originX + Math.cos(angle)*r;
    y = originY + Math.sin(angle)*r;
    angle += 0.05;
    if(expiration <= p.millis()){
      alive = false;
    }
  }
  public boolean getAlive(){
    return alive;
  }
  private PApplet p;
  private double x;
  private double y;
  private float originX;
  private float originY;
  private double r;
  private double angle;
  private int expiration;
  private boolean alive;
}
