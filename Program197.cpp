//ACCEPT RANGE FROM USER AND TOGGLE THAT BITS
#include<iostream>
using namespace std;


typedef unsigned int UINT;

UINT ToggleRange(UINT iNo,int iStart,int iEnd)
{
  
  return (iNo ^ ((0XFFFFFFFF << (iStart-1)) & (0xFFFFFFFF << (iEnd-1)));
 
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