class Sum
{
int sum(int a, int b)
{
System.out.println("Both int");
return a+b;
}
double sum(double a, double b)
{
System.out.println("Both double");
return a+b;
}
double sum(double a, int b)
{
System.out.println("double int");
return a+b;
}
double sum(int a, double b)
{
System.out.println("int double");
return a+b;
}
}

class SumDemo
{
public static void main(String [] args)
{
Sum s = new Sum();
System.out.println(s.sum(5,5));
System.out.println(s.sum(5.0,5.0));
System.out.println(s.sum(5.0,5));
System.out.println(s.sum(5,5.0));
}
}