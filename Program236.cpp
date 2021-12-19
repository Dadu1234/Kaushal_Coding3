#include<iostream>
using namespace std;
/*
int SumI(int Arr[],int iSize)
{
	int iSum = 0;
	int i = 0;
	
	for(i=0;i<iSize;i++)
	{
		iSum = iSum + Arr[i];
	}
	return iSum;
}*/
int SumI(int Arr[],int iSize)
{
	int iSum = 0;
	int i = 0;
	
	while(i<=iSize)
	{
		iSum = iSum + Arr[i];
		i++;
	}
	return iSum;
}
int main()
{
	int iLength = 0;
	int *p = NULL;
	int i = 0;
	int iRet = 0;
	
	cout<<"Enter No of elements\n";
	cin>>iLength;
	
	p = new int[iLength];
	
	cout<<"Enter the elements\n";
	
	for(i=0;i<iLength;i++)
	{
		cin>>p[i];
	}
	
	iRet = SumI(p,iLength);
	cout<<"Addition is:" <<iRet;
	
	delete []p;
	return 0;
}