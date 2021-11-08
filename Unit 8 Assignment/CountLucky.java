import java.util.*;
public class CountLucky{
  public static int countLucky(ArrayList<Integer> nums){
    int count = 0;
    for(int n : nums){
      if(n % 7 == 0 || n % 10 == 7){
        count++;
      }
    }
    return count;
  }
  public static void testCountLucky(ArrayList<Integer> nums, int expected){
    System.out.print("Array: ");
    for(int n : nums){
      System.out.print(n + ", ");
    }
    if(countLucky(nums) == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(17);
    x.add(21);
    x.add(18);

    ArrayList<Integer> y = new ArrayList<Integer>();
    y.add(12);
    y.add(14);
    y.add(107);

    testCountLucky(x, 2);
    testCountLucky(y, 2);
  }
}
