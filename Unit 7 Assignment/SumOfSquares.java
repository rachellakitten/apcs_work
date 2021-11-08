public class SumOfSquares{
  public static double sumOfSquares(double[] nums){
    double sum = 0;
    for(int i = 0; i < nums.length; i++){
      sum += nums[i]*nums[i];
    }
    return sum;
  }
  public static void testSumOfSquares(double[] nums, double expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]+", ");
    }
    if(sumOfSquares(nums)== expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    double[] x = {0};
    double[] y = {1.0, 2.0, 3.0};
    double[] z = {2.0, 2.0, 2.0};
    testSumOfSquares(x, 0);
    testSumOfSquares(y, 14);
    testSumOfSquares(z, 12);
  }
}
