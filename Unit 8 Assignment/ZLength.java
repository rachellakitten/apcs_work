import java.util.*;
public class ZLength{
  public static int zLength(ArrayList<String> names){
    int count = 0;
    for(int i = 0; i < names.size(); i++){

      if(names.get(i).charAt(0)== 'z' || names.get(i).charAt(0)== 'Z'){
        count += names.get(i).length();
      }
    }
    return count;
  }
  public static void testZLength(ArrayList<String> names, int expected){
    System.out.print("Array: ");
    for(int i = 0; i < names.size(); i++){
      System.out.print(names.get(i) + ", ");
    }
    if(zLength(names)== expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    ArrayList<String> x = new ArrayList<String>();
    x.add("Rachel");
    x.add("zRachel");
    x.add("ZRachel");

    ArrayList<String> y = new ArrayList<String>();
    y.add("zero");
    y.add("zebra");
    y.add("zname");
    y.add("imposter");

    testZLength(x, 14);
    testZLength(y, 14);
  }
}
