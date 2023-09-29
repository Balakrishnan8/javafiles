class Parent{
Parent(){
System.out.println("Parent Constructor");
}
void abs(int val){
System.out.println("int = "+val);
}
}

class A extends Parent{
A(){
System.out.println("A Constructor");
}
A(int a){
System.out.println("Parameterized Constructor");
}
void abs(double val){
System.out.println("Double = "+val);
}
}

class B extends A{
B(){
super();
System.out.println("B Constructor");
}
void abs(char val){
System.out.println("char = "+val);
}
}

public class Mainn
{
public static void main(String [] ar)
{
B b=new B();
b.abs('c');
b.abs(12.0);
b.abs(4);
}
}