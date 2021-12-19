//ACCEPT RANGE FROM USER AND ON THAT ALL BITS.

#include<iostream>
using namespace std;


typedef unsigned int UINT;

UINT ToggleRange(UINT iNo,int iStart,int iEnd)
{
  UINT iMask1 = 0xFFFFFFFF,iMask2 = 0xFFFFFFFF,iMask = 0;
  UINT iResult = 0;
  
  iMask1 = iMask1 << (iStart-1);
  iMask2 = iMask2 >> (32-iEnd);
  iMask = iMask1 & iMask2;
  iResult = iNo | iMask;
  return iResult;
 
}

//iStart = 5
//iEnd = 16
// 0000 0000 0000 0000 0000 0000 0000 0000

// 0000 0000 0000 0000 1111 1111 1111 0000
int main()
{
  UINT iValue = 0,iRet = 0;
  int i = 0,j = 0;
  cout<<"Enter number\n";
  cin>>iValue;
  
  cout<<"Enter starting position\n";
  cin>>i;
  
  cout<<"Enter ending position\n";
  cin>>j;
  
  iRet = ToggleRange(iValue,i,j);
  
  cout<<"Updated number is :"<<iRet<<"\n";
  return 0;
}