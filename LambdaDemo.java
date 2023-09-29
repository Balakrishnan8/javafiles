interface MyNumber {
	double getValue(int a, int b);
}

class LambdaDemo
{
public static void main(String [] args)
{
MyNumber myNum;
myNum = (a,b) -> a+b;
System.out.println(myNum.getValue(2,4));
}
}