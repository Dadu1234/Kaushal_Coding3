#include<iostream>
using namespace std;

int CountCapR(char *str)
{
  static int iCount = 0;
  if(*str != '\0')
  {
     if((*str>='A') && (*str<='Z'))
	 {
	    iCount++;
	 }
	 str++;
	 CountCapR(str);
  }
  return iCount;
}

int main()
{
	char Arr[20];
	int iRet = 0;
	
	cout<<"Enter string\n";
	scanf("%[^'\n']s",Arr);
	
	iRet = CountCapR(Arr);
	
	cout<<"Number of capital characters is :"<<iRet<<"\n";
	
	
	return 0;
}