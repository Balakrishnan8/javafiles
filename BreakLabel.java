public class BreakLabel
{
public static void main(String[] args)
{
/*
boolean t = true;
 first: {
 second: {
 third: {
 System.out.println("Before the break.");
 if(t) break second; // break out of second block
 System.out.println("This won't execute");
 }
 System.out.println("This won't execute");
 }
 System.out.println("This is after second block.");
 }
*/



c:for (int i=0;i<3;i++)
{
label:{
System.out.println(i);

b:for(int j=0;j<3;j++)
{
if (j==2) break label;
System.out.println(0);
}
}
}
}
}