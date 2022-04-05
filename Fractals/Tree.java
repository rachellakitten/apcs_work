import processing.core.*;
public class Tree extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    background(0);
  }
  public void draw(){
    stroke(94, 60, 58);
    translate(700, height);
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
     rotate(-radians(angle));
     branch(length*(float)0.75);
    }

  }
  public void keyPressed(){
    if(key == 'n'){
      angle += 0.5;
      background(0);
    }
    if(key == 'b'){
      angle -= 0.5;
      background(0);
    }
  }
  public static void main(String[] args){
    PApplet.main("Tree");
  }
  private float angle = 0;
}
