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
  public int CountVowels()
  {
	int iCount = 0;
    char Arr[] = Str.toCharArray();
	int iSize = Arr.length;
	for(int i = 0;i<iSize;i++)
	{
		if((Arr[i]== 'a') || (Arr[i]== 'e') || (Arr[i]== 'o') || (Arr[i]== 'u'))
		{
			iCount++;
		}
	}
	return iCount;
  }
}

class Program152
{
  public static void main(String arg[])
  {
    Marvellous mobj = new Marvellous();
	int iRet = 0;
	mobj.Accept();
	mobj.Display();
	
	iRet = mobj.CountVowels();
	
	System.out.println("Number of vowels are :"+iRet);
	
  }
}