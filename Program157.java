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
  
  public void Display()
  {
	System.out.println("String is :"+Str);
  }
}

class Marvellous extends StringX
{
  public boolean CheckPallindrome()
  {
	  int iStart = 0;
	  char Arr[] = Str.toCharArray();
	  int iEnd = Arr.length - 1;
	  char temp;
	  while(iStart<iEnd)
	  {
		  temp = Arr[iStart];
		  Arr[iStart] = Arr[iEnd];
		  Arr[iEnd] = temp;
		  iStart++;
		  iEnd--;
	  }
	  String newstr = new String(Arr);//newstr is new string to store converted string from Arr to string.
	  boolean bRet = newstr.equals(Str);
	  return bRet;
	  
  }
	  
}

class Program157
{
  public static void main(String arg[])
  {
    Marvellous mobj = new Marvellous();
	
	mobj.Accept();
	mobj.Display();
    boolean bRet;
	
	bRet = mobj.CheckPallindrome();
	if(bRet==true)
	{
	  System.out.println("String is pallindrome");
	}
	else
	{ 
	  System.out.println("String is not pallindrome");
	}
	
  }
}