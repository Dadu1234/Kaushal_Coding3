//WAP TO CREATE NEW FILE IN C.

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<io.h>

int main()
{
	int fd = 0;    //File Descriptor
	char Fname[30];
	
	printf("Enter file name\n");
	scanf("%s",Fname);
	fd = creat(Fname,0777);
	
	if(fd == -1)
	{
		printf("Unable to create file\n");
	}
	else
	{
		printf("File succesfully created\n");
	}
		
		
	
	return 0;
}
