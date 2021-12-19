import java.util.*;

class Marvellous
{
  public int Add(int Brr[])
  {
     int iSum = 0,iCnt = 0;
	 for(iCnt=0;iCnt<Brr.length;iCnt++)
	 {
		 iSum = iSum + Brr[iCnt];
	 }
	 return iSum;
  }
}
class Program144
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0,iCnt = 0;
		int iRet = 0;
		
		System.out.println("Enter number of elements");
		iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter numbers");
		
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		Marvellous mobj = new Marvellous();
        iRet = mobj.Add(Arr);
        
        System.out.println("Addition is :"+iRet);
    }
}	
