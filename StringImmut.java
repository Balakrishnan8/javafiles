public class StringImmut
{

public static void main(String [] args)
{
String s = new String("Hello");
s.concat(" world");  //string is immutable.It does not modify s.
System.out.println(s);
s = s.concat(" world"); // it does not modify s but creates new instance.
System.out.println(s);
}

}