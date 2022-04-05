import processing.core.*;
public class Seashell extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    background(0);
  }
  public void draw(){
    colorMode(HSB, 100);
    float value = map((float)angle*5/3%540, 0, 540, 0, 100);
    stroke(value, 100, 100);
    translate(700, height);
    if(angle <= 540){
      angle ++;
    }
    branch(200);

  }
  public void branch(float length){
    line(0, 0, 0, -length);
    translate(0, -length);
    if(length > 20){
     push();
     rotate(radians(angle));
     branch(length*(float)0.75);
     pop();
     rotate(radians(angle));
     branch(length*(float)0.75);
    }

  }
  public static void main(String[] args){
    PApplet.main("Seashell");
  }
  private int angle = 180;
}
