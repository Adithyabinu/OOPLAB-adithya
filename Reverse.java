public class Reverse
{
   public void reverseSentanceOfTheString(String str)
   {

	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseSentance = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseSentance = reverseSentance + word.charAt(j);
	   }
	   reversedString = reversedString + reverseSentance + " ";
	}
	System.out.println(str);
	System.out.println("Reversed String is "+reversedString);
   }
   public static void main(String[] args) 
   {
	Reverse rev = new Reverse();
	rev.reverseSentanceOfTheString("The programe is reverse of string");
   }
}