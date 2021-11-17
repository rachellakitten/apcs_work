import java.util.*;
public class FindMax{
  public static double findMax(ArrayList<Double> nums){
    if(nums.size() == 0){
      return -1.0;
    }
    double max = nums.get(0);
    for(int i = 0; i < nums.size(); i++){
      if(nums.get(i) > max){
        max = nums.get(i);
      }
    }
    return max;
  }

  public static void testFindMax(ArrayList<Double> nums, double expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.size(); i++){
      System.out.print(nums.get(i) + ", ");
    }
    if(findMax(nums)==expected){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }

  public static void main(String[] args){
    ArrayList<Double> meow = new ArrayList<Double>();
    meow.add(0.0);
    meow.add(-53.2);
    meow.add(108.0);

    ArrayList<Double> meowtwo = new ArrayList<Double>();
    meowtwo.add(1.0);
    meowtwo.add(-1.2);
    meowtwo.add(5.3);

    testFindMax(meow, 108.0);
    testFindMax(meowtwo, 5.3);
  }
}
