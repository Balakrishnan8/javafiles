public class ByteCheck
{
public static void main(String [] args)
{
// char a=13;
//char b = 5;
//char c =(char)(a*b);
//System.out.println(c);
byte a = 32;

System.out.println((a<<-1));
System.out.println(((a<<-2)+1));
System.out.println((a<<-3));
System.out.println((byte)(a<<1));
System.out.println((byte)((a<<2)+1));
System.out.println((byte)(a<<3));
}
}