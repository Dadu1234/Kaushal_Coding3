class Demo
{
  int x,y;
  
  public Demo()
  {
    System.out.println("Inside Demo Defalut constructor");
	this.x = 0;
	this.y = 0;
  }
  public Demo(int i,int j)
  {
    this();
    System.out.println("Inside Demo parameterised constructor");
    this.x = i;
	this.y = j;
  }
  public void fun()
  {
    System.out.println("Value of x is :"+this.x);
  }
  public void gun()
  {
    System.out.println("Inside Demo gun");
	this.fun();
  }
}  
class ThisDemo
{
  public static void main(String str[])
  {
    System.out.println("Inside Main");
	Demo dobj = new Demo(10,20);
	dobj.fun();
	dobj.gun();
  }
}
	