class Gen<T, V> 
{
T ob;
T ob2;
Gen(T o,T o2)
{
	ob = o;
	ob2 = o2;
}

T getob() 
{
	 System.out.println("value: " + ob);
	 System.out.println("value: " + ob2);
	return ob2;
}
void showType() 
{
	System.out.println("Type of T is " +
	ob.getClass().getName());
}
}

class GenDemo3
{
public static void main(String args[]) 
{
// Gen<Integer> iOb;
	// iOb = new Gen<Integer>(88);
 	// iOb.showType();	
 	// int v = iOb.getob();
 	// System.out.println("value: " + v);
 	// System.out.println();	
	// Gen<String> strOb = new Gen<String> ("Generics Test","String 2");	
	// strOb.showType();	
	// String str = strOb.getob();
	// System.out.println("value: " + str);

char a = 'o';
String b = "demo";

	var test = new Gen<>(a,b);
	Gen <String,String> strob2 = new Gen<>("HI","hello");
	strob2.getob();
	var iob2 = new Gen<Integer,Integer>(90,90);
	iob2.getob();

	test.getob();
	

 }
}