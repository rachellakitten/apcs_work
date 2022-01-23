import java.util.*;

public class ItemCalculator{
  public static void printPrice(ArrayList<Item> items){
    for(Item i: items)
      System.out.println("Item: "+ i.getName() + " Cost: " + i.getCost());

  }
  public static float averagePrice(ArrayList<Item> items){
      float total = 0;
      for(Item i: items)
        total += i.getCost();

      return total / items.size();


  }
  public static boolean testAveragePrice(ArrayList<Item> items, float expected){
    if(averagePrice(items) == expected){
      return true;
    }
    return false;
  }
  public static String largePrice(ArrayList<Item> items){
    float price = 0;
    String name = "";
    for(Item i: items){
      if(i.getCost() > price){
        price = i.getCost();
      }
    }
    for(Item i: items){
      if(i.getCost() == price){
        name = i.getName();
      }
    }
    return name;
  }
  public static boolean testLargePrice(ArrayList<Item> items, String expected){
    if(largePrice(items) == expected){
      return true;
    }
    return false;
  }
  public static void main(String[] args){
    ArrayList<Item> items = new ArrayList<Item>();
    items.add(new Item("Cat", (float)100.00));
    items.add(new Item("Dog", (float)0.00));
    items.add(new Item("YourBrain", (float)2));

    printPrice(items);
    System.out.println("average price: "+averagePrice(items));
    System.out.println(testAveragePrice(items, 34));
    System.out.println(testLargePrice(items, "Cat"));
  }
}
