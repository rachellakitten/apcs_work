import java.util.*;
public class AnimalCalculator{
  public static void getInfo(ArrayList<Animal> animals){
    for(Animal a : animals){
      System.out.println(a.info());
    }
  }
  public static int avgLegs(ArrayList<Animal> animals){
    int count = 0;
    for(Animal a : animals){
      count += a.getLeg();
    }
    return count / animals.size();
  }

  public static int fewLegs(ArrayList<Animal> animals){
    int count = animals.get(0).getLeg();
    for(int i = 0; i < animals.size(); i++){
      if(animals.get(i).getLeg() < count){
        count = animals.get(i).getLeg();
      }
    }
    return count;
  }
  public static void testAvgLegs(ArrayList<Animal> animals, float expected){
    if(avgLegs(animals) == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void testFewLegs(ArrayList<Animal> animals, float expected){
    if(fewLegs(animals) == expected){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
  public static void main(String[] args){
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("Lucy the leopard", 4, true));

    Human rachel = new Human("Rachel");
    animals.add(rachel);

    Cat yuumi = new Cat("yuumi");
    animals.add(yuumi);

    Sponge spongebob = new Sponge("spongebob");
    animals.add(spongebob);

    Centipede zerolegs = new Centipede("zerolegs");
    animals.add(zerolegs);

    getInfo(animals);
    testAvgLegs(animals, 22);
    testFewLegs(animals, 0);
  }
}
