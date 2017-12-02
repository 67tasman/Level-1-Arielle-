int locationX = 200;
int locationY = 200;
int hop = 10;
class car{
  int x;
  int y;
  int speed;
  int size;
  

car(int x2, int y2, int speed2, int size2){
this.x = x2;
this.y = y2;
this.speed = speed2;
this.size = size2;

}
void display(){
  fill(333,0,0);
  rect(this.x,this.y,this.size+10, this.size);
}
void move() {
  x = x + speed;

if (this.x>400){
  this.x=0;
}
 
}
}

car c1 = new car(0,10,1,20);
car c2 = new car(0,50,2,30);
car c3 = new car(0,100,3,15);


void setup(){ 
size(400,400);
}
void draw(){
background(100,0,99);
fill(0,344,0);
ellipse(locationX,locationY,10,10);
c1.display();
c1.move();
c2.display();
c2.move();
c3.display();
c3.move();
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
     locationY = locationY - hop;
      }
      else if(keyCode == DOWN)
      {
      locationY = locationY + hop;
      }
      else if(keyCode == RIGHT)
      {
      locationX = locationX + hop;
      }
      else if(keyCode == LEFT)
      {
      locationX = locationX - hop;
      }
   }
   if (locationX == 0) {
   locationX = locationX + hop;
   }
   else if (locationX == 400) {
   locationX = locationX - hop;
   }
   else if (locationY == 400) {
   locationY = locationY - hop;
   }
   else if (locationY == 0) {
   locationY = locationY + hop;
   }
}