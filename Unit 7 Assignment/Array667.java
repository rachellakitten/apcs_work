public class Array667{
  public static int array667(int[] nums) {
    int count = 0;
    for(int i = 0; i < nums.length-1; i++){
      if(nums[i]==6){
        if(nums[i+1] == 6){
          count++;
        }
        if(nums[i+1] == 7){
          count++;
        }
      }
    }
    return count;
  }
  public static void testArray667(int[] nums, int expected){
    System.out.print("Array: ");
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]+ ", ");
    }
    if(array667(nums)==expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    int[] x = {6, 6, 7, 7, 7, 7, 7};
    int[] y = {6, 7, 6, 6};
    testArray667(x, 2);
    testArray667(y, 2);
  }
}
