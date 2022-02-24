public class RectangleFunctions{
  public static double averagePerimeter(Rectangle[][] nums){
    double count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        count += nums[i][j].perimeter();
      }
    }
    int amount = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        amount++;
      }
    }
    return count / amount;
  }
  public static Rectangle greatestArea(Rectangle[][] nums){
    double count = 0;
    Rectangle curr = nums[0][0];
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        if(nums[i][j].area() >= count){
          count = nums[i][j].area();
          curr = nums[i][j];
        }
      }
    }
    return curr;
  }
  public static void main(String[] args){
    Rectangle[][] nums = new Rectangle[2][2];
    Rectangle a = new Rectangle("a", 2, 2);
    Rectangle b = new Rectangle("b", 3, 3);
    Rectangle c = new Rectangle("b", 4, 4);
    Rectangle d = new Rectangle("b", 5, 5);
    nums[0][0] = a;
    nums[0][1] = b;
    nums[1][0] = c;
    nums[1][1] = d;
    System.out.println(averagePerimeter(nums));
    System.out.println(greatestArea(nums));
}
}
