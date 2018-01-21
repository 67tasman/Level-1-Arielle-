void setup(){
size( 1000,  1000);
background( 200, 200,  200);
}
int x=0;
void draw(){
  noStroke();
for(int i = 0 ; i<=x ; i++){ 
  fill( frameCount%255, int(random(100)) ,int(random(255)));
ellipse(getWormX(i),getWormY(i),frameCount%50,frameCount%50);

}
makeMagical();
}


float frequency = .005;
float noiseInterval = 100 ; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

void mouseClicked(){
x= x+1;
}