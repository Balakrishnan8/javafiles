public class SignedDivision
{
public static void main(String [] args)
{
int dd=17,dv=4,a,n;
a=1;
n=32;
dd = dd>>1;
a = a>>1;
	for(int i=0;i<32;i++)
	{
	a = a-dv;
	if(a>0)
		dd = (dd<<1)+1;
	else{
		dd = (dd<<1);
		a=a+dv;
	}
	}
System.out.println(dd);
}
}