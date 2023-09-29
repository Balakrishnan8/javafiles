class StaticVar
{
static int i;
static void change()
{
	i++;
}
}

public class StaticExample 
{
public static void main(String [] args)
{
StaticVar s1=new StaticVar();
StaticVar s2=new StaticVar();
StaticVar.change();
StaticVar.change();
StaticVar.change();
StaticVar.change();
StaticVar.change();
StaticVar.change();
System.out.println(StaticVar.i);
}
}