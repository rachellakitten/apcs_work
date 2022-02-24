import java.util.*;
public class ShapeCollection{
  public ShapeCollection(){
    shapes = new ArrayList<Shape>();
  }
  public void writeProblem(String name, int sideNumber){
    shapes.add(new Shape(name, sideNumber));
  }
  public int numberOfSides(String name){
    for(int i = 0; i < shapes.size(); i++){
      if(shapes.get(i).getName().equals(name)){
        return shapes.get(i).getSide();
      }
    }
    return -1;
  }
  public int avgSides(){
    int count = 0;
    for(int i = 0; i < shapes.size(); i++){
      count += shapes.get(i).getSide();
    }
    return count / shapes.size();
  }
  public ArrayList<Shape> even(){
    ArrayList<Shape> even = new ArrayList<Shape>();
    for(int i = 0; i < shapes.size(); i++){
      if(shapes.get(i).getSide() % 2 == 0){
        even.add(shapes.get(i));
      }
    }
    return even;
  }
  private ArrayList<Shape> shapes;
  public static void main(String[] args){
    ShapeCollection aime = new ShapeCollection();
    aime.writeProblem("parallelogram", 4);

    System.out.println(aime.numberOfSides("parallelogram"));
    System.out.println(aime.avgSides());
    System.out.println(aime.even());
  }
}
