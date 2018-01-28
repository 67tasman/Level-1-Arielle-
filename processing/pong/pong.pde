import ddf.minim.*;       //at the very top of your sketch
  Minim minim;        //at the top of your sketch
  AudioSample sound;      //at the top of your sketch
  PImage backgroundImage;         //at the top of your sketch

int speedX = 10;
int speedY = 9;
int ballX = 500;
int ballY = 500;
int paddleY = 900;
int paddleLength = 200;

void setup(){
size(1000, 1000);
minim = new Minim (this);    //in the setup method
  sound = minim.loadSample("4388__noisecollector__pongblipe5.wav", 128);//in the setup method
  backgroundImage = loadImage("pong.png");  //in the setup method
  backgroundImage.resize(1000,1000);
}
void draw(){
  int paddleX = mouseX - 100;
image(backgroundImage, 0, 0);      //in draw method 
ellipse(ballX, ballY, 100, 100);
fill(0, 0, 255);    
stroke(0, 255, 255);  
ballX = ballX + speedX;
ballY = ballY + speedY;
rect(paddleX, paddleY, paddleLength, 20);
if(ballX>960){
  speedX = -10;
}
else if(ballX<40){
  speedX = 10;
}
if(ballY > 960){
  sound.trigger();        //in draw method (when the ball hits the bottom)
  speedY = -10;
}
else if (ballY < 40){
  speedY= 10;
}
if (intersects(ballX, ballY, paddleX, paddleY, paddleLength) == true){
  speedY = -10;
}
    
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY + 40 > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}