import java.util.*;
class get
{
    Scanner sc=new Scanner(System.in);
    private static int r;
    private String ar[];

    get() {
        System.out.println("Enter the limit of:");
       r = sc.nextInt();
       ar = new String[r];
        System.out.println("Enter some of the strings:");
        for(int i=0;i<r;i++)
        {
            ar[i]= sc.next();
        }
    }
    void sorts()
    {
        for(int i=0;i<r-1;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(ar[i].compareTo(ar[j])>0)
                {
                    String temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

}
public class sort {
    public static void main(String ...ar)
    {
        get g=new get();
        g.sorts();
    }
}






OUPUT
--------
C:\Users\ASUS\Desktop\JAVA>javac sort.java

C:\Users\ASUS\Desktop\JAVA>java sort
Enter the limit of:
8
Enter some of the strings:
1 2 3 4 26 5 8 9 4 3 2 1 5  9 0
[8, 5, 4, 3, 26, 2, 1, 9]









