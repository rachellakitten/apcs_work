public class ArrayCount9{

  public static int arrayCount9(int[] nums) {
    int length = nums.length;
    int count = 0;
    for(int i = 0; i< length; i++){
      if(nums[i] == 9){
        count++;
      }
    }
    return count;
  }
  public static void testArrayCount9(int[] nums, int expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]+", ");
    }
    System.out.println("Expected: "+expected);
    if(arrayCount9(nums) == expected){
      System.out.println("True");
    }
  }

  public static void main(String[] args){
    int[] x = {1, 9, 8, 7, 9, 5};
    int[] y = {1, 9, 9, 7, 9, 5};
    testArrayCount9(x, 2);
    testArrayCount9(y, 3);
  }
}
