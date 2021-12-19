import java.util.*;
class Marvellous
{
  public boolean ChkArmstrong(int iNo)
  {
     int iDigitCount = 0;
	 int iTemp = 0;
	 int iDigit = 0;
	 int iPower = 1;
	 int iSum = 0;
	 int i = 0;
	 if(iNo<0)
	 {
	   iNo = -iNo;
	 }
	 
	 iTemp = iNo;
	 
     while(iTemp!=0)
	 {
	   iTemp = iTemp/10;
	   iDigitCount++;
	 }
	 iTemp = iNo;
	 
	 while(iTemp!=10)
	 {
	   iDigit = iTemp%10;
	   for(i=1;i<=iDigitCount;i++)
	   {
	     iPower = iPower*iDigit;
	   }
	   iSum = iSum + iPower;
	   iPower = 1;
	   iTemp = iTemp/10;
	  }
	  if(iTemp==iNo)
	  {
	     return true;
	  }
	  else
	  {
	    return false;
	  }
  }
}
class Program142
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
	int iValue = 0;
	boolean bRet = false;
	
	System.out.println("Enter a number");
	iValue = sobj.nextInt();
	
	Marvellous mobj = new Marvellous();
	bRet = mobj.ChkArmstrong(iValue);
	
	if(bRet==true)
	{
	   System.out.println("Armstrong number");
	}
	else
	{
	   System.out.println("Not a Armstrong");
	}
  }
}