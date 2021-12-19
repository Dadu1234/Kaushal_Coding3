import java.util.*;
class StringX
{
  public String Str;
  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
	System.out.println("Enter your name");
	Str = sobj.nextLine();
  }
}
class Marvellous extends Stringx
{
	public void Display()
	{
		System.out.println("String is :"+Str);
	}
}
class Program151
{
   public static void main(String arg[])
   {
	    Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display()
   }
}