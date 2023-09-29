class UseStatic {
 static int a = 3;
 static int b;
 static void meth(int x) {
 System.out.println("x = " + x);
 System.out.println("a = " + a);
 System.out.println("b = " + b);
 }
 
 public static void main(String args[]) {
 meth(42);
Demo.caller();
new UseStatic().calls();
 }
public void calls()
{
meth(11);
}
static {
 System.out.println("Static block initialized.");
 b = a * 4;
meth(455);
a=777;
 }
}

class Demo
{
static void caller()
{
System.out.println("Im here");
}
}