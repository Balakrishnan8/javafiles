class A{
	int a;
	A(int a)
	{
		this.a=a;
	}
}
class B{
	int b;
	B(int b)
	{
		this.b=b;	
	}
}
class C extends A{
	int c;
	C(int a, int c){
		super(a);
		this.c = c;
	}
	
}
class D extends B{
	int d;
	D(int b, int d){
		super(b);
		this.d = d;
	}
}

public class Inheritt{
public static void main(String [] args){
	C objc = new C(1,3);
	D objd = new D(2,4);
	System.out.println(objc.a+ " " + objc.c);
	System.out.println(objd.b+ " " + objd.d);	
}
}