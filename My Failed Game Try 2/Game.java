import processing.core.*;
public class Game extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    
  }
  public void draw(){
    background(0);
    p.display();
  }
  public static void main(String[] args){
    PApplet.main("Game");
  }
  private Player p;
}
