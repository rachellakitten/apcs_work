import processing.core.*;
import java.util.*;

public class Animation extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    circle = new ArrayList<Circles>();
    for(int i = 0; i < 10; i++){
      circle.add(new Circles(this));
    }
  }
  public void draw(){
    background(0);

    for(Circles c : circle){
      c.display();
    }
    circle.add(new Circles(this));
    for(int i = circle.size()-1; i >= 0; i--){
      Circles c = circle.get(i);
      if(c.getAlive() == false){
        circle.remove(i);
      }
    }
  }
  private ArrayList<Circles> circle;
  public static void main(String[] args){
    PApplet.main("Animation");
  }
}
