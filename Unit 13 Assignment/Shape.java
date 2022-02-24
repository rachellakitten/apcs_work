public class Shape{
  public Shape(String name, int sideNumber){
    this.name = name;
    this.sideNumber = sideNumber;
  }
  public String getName(){
    return name;
  }
  public int getSide(){
    return sideNumber;
  }
  private String name;
  private int sideNumber;
}
