import java.util.Scanner;
public class ThreeNumbers
{
public static void main(String [] args)
{
int a,b,c;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
double avg = (a+b+c)/3;
System.out.println(avg);
}
}