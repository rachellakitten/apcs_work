import processing.core.*;
public class Triangle extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  //y=sqrtx+750-300sqrt3
  //y=-sqrt3x+750+1100sqrt3
  public void setup(){
    background(0);
  }
  public void draw(){
    tri(350, 700, side);
  }
  public void tri(float x, float y, float side){
    fill(255);
    float x2 = x + side/2;
    float y2 = y - side*(float)Math.sqrt(3)/2;
    float x3 = x + side;
    float y3 = y;
    stroke(0);

    triangle(x, y, x2, y2, x3, y3);

    side = side/2;

    if(side >= n){
      tri(x, y, side);
      tri(x+side, y, side);
      tri(x + side/2, y-side*(float)Math.sqrt(3)/2, side);
    }
  }
  public void keyPressed(){
    if(key == 'n'){
      count++;
      n = side/(float)Math.pow(2, (double)count);
    }
    if(key == 'b'){
      background(0);
      n = side/(float)Math.pow(2, (double)(count-1));
      count = count-1;
      tri(350, 700, side);
    }
  }
  public static void main(String[] args){
    PApplet.main("Triangle");
  }
  private float side = 700;
  float n = 350;
  int count = 1;
}
