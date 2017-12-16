int  birdX = 100;
int  birdY = 250;
double V = 0;
double G = .5;
int pipeX =500;
int pipeY = 300;
int pipeL = 500;
int pipe2X =800;
int pipe2Y = -200;
int pipe2L = 500;
void setup() {
  size(500, 500);
}

boolean intersects(int birdX, int birdY, int pipeX, int pipeY, int pipeL) {
if (birdY > pipeY - 4 && birdX > pipeX && birdX < pipeX + pipeL)
return true;
else 
return false;
}
void draw() {
  background(100, 0, 300);
  fill(300, 300, 0);
  ellipse(birdX, birdY, 30, 20);
  fill(0, 200, 100);   
  rect(pipeX, pipeY, 50, pipeL)  ;
  rect(pipe2X, pipe2Y , 40, pipe2L);
  pipeX += -8;
  pipe2X += -8;
  birdY += V;
  V += G;

  if (pipeX <= 0) {
    pipeX = 500;
    pipeY = (int) random(200,500);
  }
  if (pipe2X <= 0) {
    pipe2X = 800;
    pipe2Y = (int) random(-100,100);
  }
  if(intersects( birdX,  birdY,  pipeX,  pipeY, pipeL)==true){
   fill(100,200,300);
  text("you lose",100,100,100);
  textSize(80);
 
}
}




void mousePressed() {
  V = -8;
  //G = G + V;
} 