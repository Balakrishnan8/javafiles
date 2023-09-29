public class Pattern1
{

public static void main(String [] args)
{

for(int i=1;i<=5;i++)
{
for(int j=i;j<=4;j++)
{
System.out.print(" ");
}
for(int k=i;k>0;k--)
{
System.out.print(k);
}
System.out.println();
}
}

}