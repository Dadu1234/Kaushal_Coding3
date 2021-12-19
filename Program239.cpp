#include<iostream>
#include<stdio.h>
using namespace std;

int StrlenI(char *str)
{
	int iCnt = 0;
	
	while(*str!='\0')
	{
		iCnt++;
		str++;
	}
	return iCnt;

}
int StrlenR(char *str)
{
	static int iCnt = 0;
	
	if(*str!='\0')
	{
		iCnt++;
		str++;
		StrlenR(str);
	}
	return iCnt;

}
int main()
{
	char Arr[20];
	int iRet = 0;
	
	cout<<"Enter string\n";
	scanf("%[^'\n']s",Arr);
	
	iRet = StrlenR(Arr);
	
	cout<<"Length of string is :"<<iRet<<"\n";
	
	
	return 0;
}