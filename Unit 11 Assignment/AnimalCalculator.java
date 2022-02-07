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
  }
}
