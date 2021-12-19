//LSEEK IMPLEMENTATION

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

// abcde fghij klmno pqrst uvwxyz


int main()
{
  int fd = 0;
  char Arr[10];
  
  fd = open("LB17.txt",O_RDWR);
  if(fd==-1)
  {
	  printf("Unable to open file\n");
	  return -1;
  }
  
  //////
  // 0 From starting position
  // 1 From Current position
  // 2 From end of th file
  
  lseek(fd,5,0);
  
  read(fd,Arr,5);
  
  printf("Data from first seek is : \n");
  
  write(1,Arr,5);
  
  printf("\n");
  //END OF 1ST LSEEK
  
  lseek(fd,5,1); //1 = jith aahe tithun pudhe
  
  read(fd,Arr,5);
  
  printf("Data of second lseek:\n");
  
  write(1,Arr,5);
  
  //END OF SECOND LSEEK
  close(fd);
  
  return 0;
}