public class Animal{
  public Animal(String name, int legCount, boolean furry){
    this.name = name;
    this.legCount = legCount;
    this.furry = furry;
  }
  public String getName(){
    return name;
  }
  public int getLeg(){
    return legCount;
  }
  public boolean furry(){
    return furry;
  }
  public String info(){
    return "Name: " + name + " Legs: " + legCount + " Furriness: " + furry;
  }

  private String name;
  private int legCount;
  private boolean furry;
}
