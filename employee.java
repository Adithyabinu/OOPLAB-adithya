import java.util.Scanner; 
class employee 
{ 
int eno,esalary; 
String ename; 
public static void main(String[] args) 
{ 
int n,x,i;
 Scanner sc=new Scanner(System.in); 
employee[] emp=new employee[100]; 
System.out.println("Enter the no of employees"); 
n=sc.nextInt(); for(i=0;i<n;i++) 
{
 System.out.println("Enter Employee No:");
 emp[i]=new employee(); 
emp[i].eno=sc.nextInt(); 
System.out.println("Enter Employee Salary:"); 
emp[i].esalary=sc.nextInt(); 
System.out.println("Enter Employee Name:"); 
emp[i].ename=sc.next(); 
}
 System.out.println("Enter the employee id you want to find :");
 x=sc.nextInt();
 for(i=0;i<n;i++)
 { 
if(emp[i].eno==x) 
{ 
System.out.println("Employee found at postion" + (i + 1));
 break;
 } 
}
 if(i==n)
 {
 System.out.println("employee not found"); 
}
 }
 }