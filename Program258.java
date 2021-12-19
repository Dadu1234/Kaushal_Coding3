//Efficient bubble sort code.
import java.util.*;

class Sorting
{
   public void BubbleSort(int Arr[])
   {
	   int pass = 0,j = 0,temp = 0;
	   int size = Arr.length;
	   boolean flag = false;
	   for(pass = 0;pass < size;pass++)
	   {
		   flag = false;
		   for(j = 0;j < size - pass - 1;j++)
		   {
			   if(Arr[j] > Arr[j+1])
			   {
				   flag = true;
				   temp = Arr[j];
				   Arr[j] = Arr[j + 1];
				   Arr[j+1] = temp;
			   }
		   }
		   if(flag == false)
		      break;  //ha break outer loop la thambvtoy.
		   System.out.println("Data after pass"+ pass+1);
		   for(int i = 0;i < Arr.length;i++)
		   {
			   System.out.println(Arr[i] + " ");
		   }
		   System.out.println();
		   
	   }
   }
}

class Program258
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		int Arr[] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
		//System.out.println("Enter the element to search");
		//int value = sobj.nextInt();
		
		Sorting obj = new Sorting();
		
		//boolean bret = obj.change(Arr,value);
		obj.BubbleSort(Arr);
		
		System.out.println("Data after sorting");
		for(int i = 0;i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}