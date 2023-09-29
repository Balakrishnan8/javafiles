public class DivideKrishna
{
// Unsigned
public static void main(String [] args)
{
	int dd=-10,dv=3,q=0,r;
	r=dd;
	dv = dv<<4;
	while(dv>1)
	{
		r=r-dv;
		if(r<0)
		{
			r=r+dv;
			q=q<<1;
		}
		else
		{
			q=(q<<1)+1;
		}
		dv=dv>>1;
	}
	System.out.println(q);
}
}