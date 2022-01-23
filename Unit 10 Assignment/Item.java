import java.util.*;

public class Item{
  public Item(String name, float cost){
    this.name = name;
    this.cost = cost;
  }

  public String getName(){
    return name;
  }

  public float getCost(){
    return cost;
  }

  private String name;
  private float cost;
}
