int  birdX = 100;
int  birdY = 250;
int V = 0;
int G = 1;
void setup(){
  size(500,500);
  
}

void draw(){
  
  background(100,0,300);
  fill(300,300,0);
  ellipse(birdX,birdY,30,20);
  birdY = birdY+V;
V = V + G;
}

void mousePressed(){
  G = -1;

}