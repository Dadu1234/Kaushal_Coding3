#include<iostream>
using namespace std;

typedef unsigned int UINT;

/*
  op1  op2   &   |   ^
 
   1    0    0   
   
   
   
   
*/
// iNO  0000  0000  1110  0100  1111  0100  1011  1010
// iPos 6
// iRet 0000  0000  1110  0100  1111  0100  1001  1010

UINT ToggleNibble(UINT iNo)
{
	int iMask = 0xF000000F;
	int iResult = 0;
	if((iPos < 1) || (iPos > 32))
	{
		return 0;
	}
	
	
	
	iResult = iNo ^ iMask;
	
	return iResult;
	
}
int main()
{
	int iValue = 0,iRet = 0;
	int i = 0;
	
	cout<<"Enter number\n";
	cin>>iValue;

	
    iRet = ToggleBit(iValue);
	
	cout<<"Updated number is : "<<iRet<<"\n";
	return 0;
}
	
	
	