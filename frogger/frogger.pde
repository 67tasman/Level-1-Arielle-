int locationX = 200;
int locationY = 300;
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

int getX(){
return this.x;
}
int getY(){
return this.y;
}
int getSize(){
  return this.size;
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
  else if( this.x<0){
    this.x = 400;
}
}
 boolean intersects(car car){
   if ((locationY > car.getY()&&locationY<car.getY()+50)&&(locationX >car.getX()&&locationX<car.getX()+car.getSize()))
     return true;
     else 
     return false;
}

}

car c1 = new car(0,180,4,20);
car c2 = new car(0,50,-6,30);
car c3 = new car(0,100,7,15);
car c4 = new car(0, 120, -5 , 19);

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
c4.display();
c4.move();
if (c1.intersects(c1)== true){
  locationX = 200;
  locationY = 300;
}
if (c4.intersects(c4)== true){
  locationX= 200;
  locationY = 300;
}
if (c2.intersects(c2)== true){
  locationX= 200;
  locationY = 300;
}
if (c3.intersects(c3)== true){
  locationX= 200;
  locationY= 300;
}
if (locationY == 10){
  text( "winner!", 0,300);
  textSize(100);
}

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