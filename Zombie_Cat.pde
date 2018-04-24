void setup() {
  size(1000,1000);
  PImage Cat = loadImage("Flat Cat.jpg");
  image(Cat,0,0);
  Cat.resize(1000,1000);
  
}

void draw(){
  int ScreenX = 1000;
  int ScreenY = 1000;
  
  int MouseX = mouseX;
  int MouseY = mouseY;
  
  if (MouseX == 0) {
    MouseX = 1;
  }
  
  if (MouseY == 0) {
    MouseY = 1;
  }
  
  float ColorValue = (((((MouseX*255)/ScreenX)*((MouseY*255)/ScreenY)/255)));
  fill(MouseX,ColorValue,MouseY);
  ellipse(560,416,50,50);
  ellipse(327,407,50,50);
  print("                    "+ColorValue);
}
