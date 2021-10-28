import processing.core.*;
public class Game extends PApplet{
  public void settings(){
    size(1400, 800);
  }
  public void setup(){
    p = new Player(this);
  }
  public void draw(){
    background(0);
    p.display();
  }
  public void keyPressed(){
    if(key == 'w'){
      p.setVY(-5);
    }else if(key == 'a'){
      p.setVX(-5);
    }else if(key == 's'){
      p.setVY(5);
    }else if(key == 'd'){
      p.setVX(5);
    }
  }
  public void keyReleased(){
    if(key == 'w' || key == 's'){
      p.setVY(0);
    }
    if(key == 'a' || key == 'd'){
      p.setVX(0);
    }
  }
  public static void main(String[] args){
    PApplet.main("Game");
  }
  private Player p;
}
