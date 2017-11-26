int locationX = 200;
int locationY = 200;
int hop = 10;

void setup(){ 
size(400,400);
}
void draw(){
background(100,55,99);
fill(123,344,486);
ellipse(locationX,locationY,10,10);
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
     hop = -1;
   }
}
  