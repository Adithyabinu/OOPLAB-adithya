class CPU {
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(double core,String manufacturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"TB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class cpus
{
    public static void main(String ...a)
    {
        CPU c = new CPU(40000);
        CPU.processor pr=c.new processor(5,"Adithya");
        new CPU.RAM(1,"Adithya");

    }
}






OUTPUT
---------
C:\Users\ASUS\Desktop\JAVA>javac cpus.java

C:\Users\ASUS\Desktop\JAVA>java cpus
Cores5.0
Manufacturer:Adithya
Memory:1.0TB
Manufacturer:Adithya
