class StrConcatWays
{
public static void main(String [] args)
{

// Using StringBuilder;
StringBuilder s1 = new StringBuilder("String");
StringBuilder s2 = new StringBuilder("String");
System.out.println(s1.toString().equals(s2.toString()));
String s = s1.append(s2).toString();
System.out.println(s);

// Using format() method;
String s3 = "hello";
String s4 = " world";
String s5 = String.format("%s%s",s3,s4);
System.out.println(s5);

// Using join() method;
String s6 = "Ben";
String s7 = "Tennyson";
String s8 = String.join(" ",s6,s7);
System.out.println(s8);

}
}