import java.util.*;
public class SumOfSquares{
  public static double sumOfSquares(ArrayList<Double> nums){
    double sum = 0;
    for(int i = 0; i < nums.size(); i++){
      sum += nums.get(i)*nums.get(i);
    }
    return sum;
  }
  public static void testSumOfSquares(ArrayList<Double> nums, double expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.size(); i++){
      System.out.print(nums.get(i)+", ");
    }
    if(sumOfSquares(nums)== expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    ArrayList<Double> x = new ArrayList<Double>();
    x.add(0.0);

    ArrayList<Double> y = new ArrayList<Double>();
    y.add(1.0);
    y.add(2.0);
    y.add(3.0);

    ArrayList<Double> z = new ArrayList<Double>();
    z.add(2.0);
    z.add(2.0);
    z.add(2.0);

    testSumOfSquares(x, 0);
    testSumOfSquares(y, 14);
    testSumOfSquares(z, 12);
  }
}
