public class TestRectangle{
  public static void main(String[] args){
    Rectangle a = new Rectangle(3, 4);
    Rectangle b = new Rectangle(3, 6);
    Rectangle c = new Rectangle(9, 40);

    System.out.println(a.getWidth());
    System.out.println(b.getWidth());

    System.out.println(c.getLength());
    System.out.println(a.getLength());

    System.out.println(a.area());
    System.out.println(b.area());

    System.out.println(c.perimeter());

    System.out.println(a.diagonal());
    System.out.println(b.diagonal());
    System.out.println(c.diagonal());
  }
}
