import java.util.*;
public class FilterGoodScores{
  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> scores){
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i = 0; i < scores.size(); i++){
      if(scores.get(i)> 90){
        result.add(scores.get(i));
      }
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<Integer> moo = new ArrayList<Integer>();
    moo.add(53);
    moo.add(100);
    moo.add(90);
    for(int i = 0; i < filterGoodScores(moo).size(); i++){
      System.out.println(filterGoodScores(moo).get(i));
    }
  }
}
