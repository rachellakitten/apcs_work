public class Rectangle{
  public Rectangle(int w, int l){
    width = w;
    length = l;
  }
  public int getWidth(){
    return width;
  }
  public int getLength(){
    return length;
  }
  public int area(){
    return width*length;
  }
  public int perimeter(){
    return 2*(width + length);
  }
  public double diagonal(){
    return Math.sqrt(width*width+length*length);
  }
  private int width;
  private int length;
}
