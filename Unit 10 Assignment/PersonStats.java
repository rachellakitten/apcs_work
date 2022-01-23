import java.util.*;
public class PersonStats{
  public static float averageNumberOfPets(ArrayList<Person> persons){
    float total = 0;
    for(Person p: persons){
      total += p.getNumberOfPets();
    }
    return total/persons.size();
  }
  public static String mostPets(ArrayList<Person> persons){
    float petNum = 0;
    String name = "";
    for(Person p: persons){
      if(p.getNumberOfPets() > petNum){
        petNum = p.getNumberOfPets();
      }
    }
    for(Person p: persons){
      if(p.getNumberOfPets() == petNum){
        name = p.getName();
      }
    }
    return name;
  }
  public static ArrayList<String> manyPets(ArrayList<Person> persons){
    ArrayList<String> result = new ArrayList<String>();
    for(Person p: persons){
      if(p.getNumberOfPets() >= 2){
        result.add(p.getName());
      }
    }
    return result;
  }
  public static boolean testAvg(ArrayList<Person> persons, float expected){
    if(averageNumberOfPets(persons)==expected){
      return true;
    }
    return false;
  }
  public static boolean testMostPets(ArrayList<Person> persons, String expected){
    if(mostPets(persons).equals(expected)){
      return true;
    }
    return false;
  }
  public static boolean testManyPets(ArrayList<Person> persons, ArrayList<String> expected){
    if(mostPets(persons).equals(expected)){
      return true;
    }
    return false;
  }
  public static void main(String[] args){
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Person("Rachel", 0));
    persons.add(new Person("Oscar", 2));
    persons.add(new Person("Ben", 3));
    persons.add(new Person("Dr. Kessner", 11));

    ArrayList<String> annoying = new ArrayList<String>();
    annoying.add("Oscar");
    annoying.add("Ben");
    annoying.add("Dr. Kessner");

    System.out.println(testAvg(persons, 4));
    System.out.println(testMostPets(persons, "Dr. Kessner"));
    for(int i = 0; i < manyPets(persons).size(); i++){
      System.out.println(manyPets(persons).get(i));
    }
    System.out.println(testManyPets(persons, annoying));
  }
}
