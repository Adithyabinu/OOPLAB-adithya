class shape
 {
 void draw()
 {
 System.out.println("Shape draw()");
 }
 void erase() 
{
 System.out.println ("Shape erase()");
 }
 }
class Circle extends shape
 {
 void draw()
 {
 System.out.println ("Circle draw()");
 }
void erase()
 {
 System.out.println ("Circle erase()");
 }
}
class Triangle extends shape
 {
 void draw()
 {
 System.out.println("Triangle erase()");
 }
}
class Square extends shape
 {
 void draw()
 {
 System.out.println ("Square draw()");
 }
void erase()
 {
 System.out.println ("Square erase()");
 }
}
public class Shapes
 {
 public static shape randshape()
 {
 switch((int)(Math.random()*3))
 {
 case 0: return new Circle();
 case 1: return new Square();
 case 2: return new Triangle();
 default : System.out.println("default");
 return new shape();
 }
}
 public static void main (String arg[])
 {
 shape s[] = new shape[9];
 for(int i = 0;i< s.length; i++)
s[i] = randshape();
 for(int i= 0;i < s.length; i++)
 s[i].draw();
 }
}