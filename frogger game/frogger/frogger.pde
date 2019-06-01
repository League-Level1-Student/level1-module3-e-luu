int xp = 300;
int yp = 500;
car carl = new car(40,40,50,5);
car cara = new car(40,160,50,5);
car carlos = new car(40,280,50,5);
car carla = new car(40,400,50,5);
void setup(){
size(844,600);

}

void draw(){
background(#464141);
fill(#2AB434);
ellipse(xp,yp,50,50);
inside();
carl.display();
cara.display();
carlos.display();
carla.display();
carl.mleft();
cara.mright();
carlos.mleft();
carla.mright();
if(carl.intersects(carl)){
xp=300;
yp=500;
}
if(cara.intersects(cara)){
xp=300;
yp=500;
}
if(carlos.intersects(carlos)){
xp=300;
yp=500;
}
if(carla.intersects(carla)){
xp=300;
yp=500;
}
if(yp==0){
  textSize(50);
text("you win!", 100,100);
}
}

void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                  yp-=5;
            }
            else if(keyCode == DOWN)
            {
                  yp+=5;
            }
            else if(keyCode == RIGHT)
            {
                  xp+=5;
            }
            else if(keyCode == LEFT)
            {
                  xp-=5;
            }
      }
}
void inside(){
if(xp>844){
xp = 844;
}
if(xp<0){
xp = 0;
}
if(yp>600){
  yp = 600;
}
if(yp<0){
yp = 0;
}
}

public class car{
int cxp;
int cyp;
int speed;
int size;
public car(int x,int y, int s, int sp){
this.cxp = x;
this.cyp = y;
this.speed = sp;
this.size = s;
}
 void display() 
{
      fill(0,255,0);
      rect(cxp , cyp, size, 50);
}
void mleft(){
cxp-=speed;
if(cxp<0){
cxp=800;
}
}
void mright(){
cxp+=speed;
if(cxp>844){
cxp=0;
}
}
int getx(){
return cxp;
}
int gety(){
return cyp;
}
int getsize(){
return size;
}

boolean intersects(car car) {
      if ((yp > car.gety() && yp < car.gety()+50) && (xp > car.getx() && xp < car.getx()+car.getsize()))
      {
             return true;
      }
      else 
      {
             return false;
      }

}
}
