public class Animal{
  public Animal(String name){
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

  private String name;
  private int legCount;
  private boolean furry;
}
