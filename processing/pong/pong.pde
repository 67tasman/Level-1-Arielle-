int speed = 10;
int speedback = 20;
int ballX = 500;
int ballY = 500;
void setup(){
size(1000, 1000);
}
void draw(){
background(200, 200, 0);
ellipse(ballX, ballY, 100, 100);
fill(0, 0, 255);    
stroke(0, 255, 255);  
if(ballX != 960){
ballX = ballX + speed;
}
else if(ballX==960){
  ballX = ballX - speed;
}

}