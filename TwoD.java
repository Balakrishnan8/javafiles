public class TwoD
{
public static void main(String [] args)
{
int days[][] = new int [2][];
days[0] = new int[2];
days[1] = new int[1];
int k =1;
for (int i=0;i<2;i++)
{
for(int j=0;j<days[i].length;j++)
{
days[i][j] = k++;
System.out.println(days[i][j]);
}
}

days[0][0]=5;
days[0][1]=5;
days[1][0]=5;

System.out.println(days[0][0]);
System.out.println(days[0][1]);
System.out.println(days[1][0]);

}
}