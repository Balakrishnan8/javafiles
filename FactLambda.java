interface Factorial{
	double func(double n);
}

class FactLambda
{
public static void main(String [] ar)
{
	Factorial fact = (n) -> {
		int f=1;
		for (int i=1;i<=n;i++)
		{
			f *= i;
		}
		return f;
	};

System.out.println(fact.func(5));
System.out.println(fact.func(6));
}
}