public class ZLength{
  public static int zLength(String[] names){
    int count = 0;
    for(int i = 0; i < names.length; i++){

      if(names[i].charAt(0)== 'z' || names[i].charAt(0)== 'Z'){
        count += names[i].length();
      }
    }
    return count;
  }
  public static void testZLength(String[] names, int expected){
    System.out.print("Array: ");
    for(int i = 0; i < names.length; i++){
      System.out.print(names[i] + ", ");
    }
    if(zLength(names)== expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    String[] x = {"Rachel", "zRachel", "ZRachel"};
    String[] y = {"zero", "zebra", "zname", "imposter"};
    testZLength(x, 14);
    testZLength(y, 14);
  }
}
