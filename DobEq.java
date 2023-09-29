class DobEq
{

public static void main(String [] args)
{

String s1 = "string";
String s2 = "string";

if(s1 == s2)
	System.out.println("s1 and s2 have same reference");
else
	System.out.println("s1 and s2 have different reference");

String s3 = new String("string");
String s4 = new String("string");

if(s3 == s4)
	System.out.println("s3 and s4 have same reference");
else
	System.out.println("s3 and s4 have different reference");

if(s1 == s3)
	System.out.println("s1 and s3 have same reference");
else
	System.out.println("s1 and s3 have different reference");

}

}