import java.util.*;
import MarvellousNumbers.ArrayX;
class ArrayX
{
	public int Arr[];    //Reference to array(No memory)
	
	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		int iCnt = 0;
		System.out.println("Enter elements");
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}
	public void Display()
	{
	   int iCnt = 0;
	   System.out.println("Elements are: ");
	   for(iCnt = 0;iCnt < Arr.length;iCnt++)
	   {
		   System.out.println(Arr[iCnt]);
	   }
	}
}
class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super(iValue); 
	}
	public float Average()
	{
		int iSum = 0,iCnt = 0;
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			iSum = iSum + Arr[iCnt];
		}
		return (iSum/Arr.length);
	}
	
}
class Program148
{
   public static void main(String arg[])
   {
	 Scanner sobj = new Scanner(System.in);
     int iLength = 0;
	 float fRet = 0.0f;
	 
	 System.out.println("Enter size of array");
	 iLength = sobj.nextInt();
	 
	 Marvellous mobj = new Marvellous(iLength);
	 mobj.Accept();
	 mobj.Display();
	 
	 fRet = mobj.Average();
	 System.out.println("Average is "+fRet);
   }
}