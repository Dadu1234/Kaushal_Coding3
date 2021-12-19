#include<iostream>
using namespace std;

int CountCapI(char *str)
{
  int iCount = 0;
  while(*str != '\0')
  {
     if((*str>='A') || (*str<='Z'))
	 {
	    iCount++;
	 }
	 str++;
  }
  return iCount;
}

int main()
{
	char Arr[20];
	int iRet = 0;
	
	cout<<"Enter string\n";
	scanf("%[^'\n']s",Arr);
	
	iRet = CountCap(Arr);
	
	cout<<"Number of capital characters is :"<<iRet<<"\n";
	
	
	return 0;
}