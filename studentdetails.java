import java.util.*;
interface Student
{
int regno=100;
String name= "Adithya",course="MCA";
}

class Sports
{
String item;
float mark;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Item");
item=sc.next();
System.out.println("Enter the Mark");
mark=sc.nextFloat();
	
}
}

class Result extends Sports implements Student
{
	void display()
	{
	System.out.println("\nStudent details are\n");
	System.out.print(regno);
	System.out.print("\t");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(course);
	System.out.print("\t");
	System.out.print(item);
	System.out.print("\t");
	System.out.print(mark);
	}
	
}

public class StudentDetails
{
	
	public static void main(String args[])
	
	{
		Result res=new Result();
		res.read();
		res.display();
		
	}
}





OUTPUT
--------------
C:\Users\ASUS\Desktop>cd JAVA

C:\Users\ASUS\Desktop\JAVA>javac StudentDetails.java

C:\Users\ASUS\Desktop\JAVA>java StudentDetails
Enter the Item
paste
Enter the Mark
45

Student details are

100     Adithya MCA     paste   45.0
C:\Users\ASUS\Desktop\JAVA>

