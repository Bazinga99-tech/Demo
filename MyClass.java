class MyClass
{
public void generateNum()
{
	System.out.println("Numbers from 11 to 20");
	for(int i=11;i<=20;i++)
	{
		System.out.println(i);
	}
	System.out.println("Numbers from 20 to 11");
	for(int j=20;j>=11;j--)
	{
		System.out.println(j);
	}
}

public void checkNum(int a, int b)
{
	if(a>b)
	{
		System.out.println(a+ " is greater");
	}
	else
	{
		System.out.println(b+" is greater");
	}

}
public static void main(String args[])
{
	MyClass obj=new MyClass();
	obj.checkNum(10,20);
	obj.generateNum();
}



}