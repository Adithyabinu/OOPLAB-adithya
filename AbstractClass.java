import java.util.*;
abstract class Shape {
	int l, b, r;
	Scanner input = new Scanner(System.in);
	abstract void printArea();
}

class Rectangle extends Shape {
	void printArea() {
		System.out.print("Enter length and breadth: ");
		l = input.nextInt();
		b = input.nextInt();
		System.out.println("The area of Rectangle is: " + l * b);
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.print("Enter Base And Height: ");
		l = input.nextInt();
		b = input.nextInt();
		System.out.println("The area of Triangle is: " + (l * b) / 2);
	}
}

class Circle extends Shape {
	void printArea() {
		System.out.print("Enter Radius: ");
		r = input.nextInt();
		System.out.println("The area of Circle is: " + 3.14f * r * r);
	}
}

class AbstractClass 
{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Circle cir = new Circle();
		cir.printArea();
	}
}