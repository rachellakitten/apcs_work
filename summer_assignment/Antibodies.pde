class Antibodies{
  float x;
  float y;
  float vx;
  float vy;
  
  int c;
  
  
  Antibodies(float xIn, float yIn, float vxIn, float vyIn){
    x=xIn;
    y=yIn;
    vx=vxIn;
    vy=vyIn;
    c = color(random(0, 255), random(0, 255), random(0, 255));
  }
  void display(){
    
    fill(c);
    
    rect(x, y, 20, 20);
    
   x += vx;
   y += vy;
   c = color(random(0, 255), random(0, 255), random(0, 255));
   
   if (x<0 || x>width)
      vx = -vx;
      
   if (y<0 || y>height)
      vy = -vy;
 }
}
