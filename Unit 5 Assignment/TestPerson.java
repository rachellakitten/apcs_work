public class TestPerson{
  public static void main(String[] args){
    Person Rachel = new Person("rachel", 0);
    Person Mila = new Person("mila", 1);
    Person Sonia = new Person("sonia", 4);

    System.out.println(Rachel.greeting());
    System.out.println(Mila.greeting());
    System.out.println(Sonia.greeting());

    System.out.println(Rachel.getName());
    System.out.println(Mila.getNumberOfPets());
  }
}
