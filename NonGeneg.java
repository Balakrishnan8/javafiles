class DemoObj
{
Object ob;
public DemoObj(Object obj)
{
ob = obj;
}

public void getType()
{
	System.out.println(ob.getClass().getName());	
}

public Object dispVal()
{
	return ob;
}

}

public class NonGeneg
{
public static void main(String [] args)
{
DemoObj obj = new DemoObj(88);
DemoObj obj2 = new DemoObj(8.0f);

obj.getType();
System.out.println(obj.dispVal());

obj2.getType();
// float val = obj2.dispVal();
System.out.println(obj2.dispVal());

obj = obj2;
obj.getType();


DemoObj str = new DemoObj("STR");

str.getType();
System.out.println(str.dispVal());

obj = str;
System.out.println(obj.dispVal());

}
}