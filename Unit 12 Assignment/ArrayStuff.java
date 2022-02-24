public class ArrayStuff{
  public static int small(int[][] nums){
    int count = nums[0][0];
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        if(nums[i][j]<= count){
          count = nums[i][j];
        }
      }
    }
    return count;
  }
  public static float sum(float[][] nums){
    float count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        count += nums[i][j];
      }
    }
    return count;
  }
  public static int aWords(String[][] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums.length[i]; j++){
        if(nums[i][j].substring(0, 1).equals("A")){
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args){
    int[][] count = new int[10][10];
    for(int i = 0; i < count.length; i++){
      for(int j = 0; j < count.length[i]; j++){
        if(i == j){
          count[i][j]= 1;
        }else{
          count[i][j]= 0;
        }
      }
    }

  String[][] cats = {{"hi", "bye"},
                    {"cats", "dogs"}

  };
  int[][] nums = new int[5][5];
  for(int i = 0; i < nums.length; i++){
    for(int j = 0; j < nums.length[i]; j++){
      nums[i][j]= 10*(i+1) + j;
    }
  }

  for(int i = 0; i < 10; i++){
    for(int j = 0; j < 10; j++){
      System.out.print(count[i][j]+" ");
    }
    System.out.println("");
  }
  for(int i = 0; i < 5; i++){
    for(int j = 0; j < 5; j++){
      System.out.print(nums[i][j] + " ");
    }
    System.out.println("");
  }

  }

}
