ArrayList<Antibodies> antib;
ArrayList<Virus> virus;
PImage vimage;


void setup(){
  background(0);
  size(700, 700);
  smooth();
  noStroke();
  vimage =loadImage("virus.png");
  vimage.resize(90, 100);
  virus = new ArrayList<Virus>();
  antib = new ArrayList<Antibodies>();
  for(int i = 0; i<80; i++){
         Virus v = new Virus(random(0, 700), random(0, 700), random(-10, 10), random(-10, 10));
         virus.add(v);
    }
  for(int i = 0; i<10; i++){
         Antibodies a = new Antibodies(random(0, 700), random(0, 700), random(-15, 15), random(-15, 15));
         antib.add(a);
    }
}

void draw(){
  background(0);
  for (Antibodies a : antib){
    a.display();
  }
  for (Virus v : virus){
      v.display();
  }
  

for (Virus v : virus){
  for(Antibodies a: antib){
    if(v.destroyed(a.x, a.y)){
      if(20 >= v.size){
        v.gone = true;
      }
      }
  }
  }  
for (int i=virus.size()-1; i>=0; i--){
 

  if (virus.get(i).gone){
    virus.remove(i);
  }
  }
  int sizee = virus.size();
  if(sizee == 0){
  antib.clear();
  ellipse(200, 100, 50, 50);
  ellipse(500, 100, 50, 50);
  arc(350, 400, 500, 300, 0, 3.14);

  }
}
