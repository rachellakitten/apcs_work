public class Person{
  public Person(String n, int p){
    name = n;
    numberOfPets = p;
  }
  public String getName(){
    return name;
  }
  public int getNumberOfPets(){
    return numberOfPets;
  }
  public String greeting(){
    return "Hello my name is "+name+" and I have "+ numberOfPets + " pets.";
  }
  private String name;
  private int numberOfPets;
}
