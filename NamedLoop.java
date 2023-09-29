public class NamedLoop
{
public static void main(String [] args)
{
for(int i=0;i<5;i++)
{
label:for(int j=0;j<5;j++)
{
System.out.println(j);
if(j==3)
break label;
}
}
}
}