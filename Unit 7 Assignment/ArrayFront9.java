public class ArrayFront9{
  public static boolean arrayFront9(int[] nums) {
    int length = 0;
    if(nums.length >= 4){
      length = 4;
    }else{
      length = nums.length;
    }
    for(int i = 0; i < length; i++){
      if(nums[i]==9){
        return true;
      }
    }
    return false;
  }
  public static void testArrayFront9(int[] nums, boolean expected){
    int length = nums.length;
    System.out.print("Array: ");
    for(int i = 0; i < length; i++){
      System.out.print(nums[i]+", ");
    }
    if(arrayFront9(nums)== expected){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
  public static void main(String[] args){
    int[] x = {2, 9, 3};
    int[] y = {2, 5, 6, 3, 9};
    testArrayFront9(x, true);
    testArrayFront9(y, false);
  }
}
