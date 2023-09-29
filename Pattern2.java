public class Pattern2
{

public static void main(String [] args)
{
int k=1,l=2;
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++)
{
if (i%2==0)
{
	System.out.print(k + " ");
	k+=2;
}
else
{
	System.out.print(l + " ");
	l+=2;
}
}
System.out.println();
}

}

}