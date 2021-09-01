class Virus{
  float x;
  float y;
  float vx;
  float vy;
  float size = 20;
  boolean gone = false;
  
  Virus(float xIn, float yIn, float vxIn, float vyIn){
    x=xIn;
    y=yIn;
    vx=vxIn;
    vy=vyIn;
  }
  void display(){
    
   image(vimage, x, y);
   //ellipse(x, y, 50, 50);
   x += vx;
   y += vy;
   
   if (x<0 || x>width)
      vx = -vx;
      
   if (y<0 || y>height)
      vy = -vy;
  }
  boolean destroyed(float xx, float yy){
    if (dist(xx, yy, x, y) <= size){
      return true;
    }else return false;
  }
}
