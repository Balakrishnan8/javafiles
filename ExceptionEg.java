public class ExceptionEg
{
public static void main(String [] args)
{

try{
	int a[] = {0,0,0};
	a[9] = 9;
}

catch(Exception e){
	System.out.println(e);
}

}
}