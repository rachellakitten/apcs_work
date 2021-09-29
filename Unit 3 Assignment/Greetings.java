public class Greetings{
  public static void main(String[] args){
    testGreeting("rachel");
    testGreeting("english reading");
    testGreeting("this ap comp sci assignment");
  }
  public static String greeting(String name){
    return "Hello," + name + "hope you aren't procrastinating on your homework like I am :D";
  }
  public static void testGreeting(String name){
    System.out.println(greeting(name));
  }
}
