import java.util.*;
public class TransformingAList{
  public static String reverse(String str){
    String result = "";
    for(int i = str.length(); i > 0; i--){
      result += str.substring(i-1, i);
    }
    return result;
  }
  public static ArrayList<String> reverseAll(ArrayList<String> words){
    ArrayList<String> result = new ArrayList<String>();
    for(int i = 0; i < words.size(); i++){
      result.add(reverse(words.get(i)));
    }
    return result;
  }

  public static void main(String[] args){
    ArrayList<String> cat = new ArrayList<String>();
    cat.add("hi");
    cat.add("bye");
    cat.add("racecar");

    for(int i = 0; i < reverseAll(cat).size(); i++){
      System.out.println(reverseAll(cat).get(i));
    }
  }
}
