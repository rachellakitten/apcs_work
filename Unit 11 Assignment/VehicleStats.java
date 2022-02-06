import java.util.*;
public class VehicleStats{
  public static int wheelNumber(ArrayList<Vehicle> vehicles){
    int count = 0;
    for(Vehicle v : vehicles){
      count += v.wheelCount();
    }
    return count;
  }
  public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles){
    ArrayList<Vehicle> count = new ArrayList<Vehicle>();
    for(Vehicle v : vehicles){
      if(v.isHumanPowered()){
        count.add(v);
      }
    }
    return count;
  }
  public static void testWheelNumber(ArrayList<Vehicle> vehicles, int expected){
    if(wheelNumber(vehicles)==expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void testHumanPowered(ArrayList<Vehicle> vehicles, ArrayList<Vehicle> expected){
    if(humanPowered(vehicles).equals(expected)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Bicycle());
    vehicles.add(new Unicycle());
    vehicles.add(new Car());
    vehicles.add(new Motorcycle());

    ArrayList<Vehicle> test = new ArrayList<Vehicle>();
    test.add(new Bicycle());
    test.add(new Unicycle());

    testWheelNumber(vehicles, 9);
    testHumanPowered(vehicles, test);
  }
}
