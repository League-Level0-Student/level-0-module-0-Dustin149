void setup(){
  
  size(500, 500);
  fill(119,78,40); // Brown - Crust
  ellipse(250,250,255,255);
  fill(255,39,15); // Red - Sauce
  ellipse(250,250,230,230);
  fill(255,151,15); // Yellow - Cheese
  ellipse(250,250,210,210);
  

}

void draw(){
   if (mousePressed) {
    fill(160,26,0); // Dark Red
    ellipse(mouseX,mouseY,25,25);
   }
}
