public class CountLucky{
  public static int countLucky(int[] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] % 7 == 0 || nums[i] % 10 == 7){
        count++;
      }
    }
    return count;
  }
  public static void testCountLucky(int[] nums, int expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]+ ", ");
    }
    if(countLucky(nums) == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    int[] x = {17, 27, 7, 4, 4, 4, 4};
    int[] y = {7, 18, 21};
    testCountLucky(x, 3);
    testCountLucky(y, 2);
  }
}
