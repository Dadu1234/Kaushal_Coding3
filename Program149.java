import java.util.*;
class Program149
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str;  //No memory allocation
		
		System.out.println("Enter your name");
		str = sobj.nextLine();
		
		System.out.println("Hello :"+str);
	}
}