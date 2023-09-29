public class DivisionP {
public static void main(String [] args)
{
int dividend = Integer.MIN_VALUE;
int divisor = 1;

if(dividend == 1<<31 && divisor == -1) System.out.println(Integer.MAX_VALUE);
 boolean sign = (dividend>=0)==(divisor>=0);

dividend = Math.abs(dividend);
divisor = Math.abs(divisor);
int result=0;

while(dividend-divisor >= 0){
int count=0;
while(dividend - (divisor<<1<<count)>=0)
	count++;
result += 1<<count;
dividend -= divisor<<count;
}

System.out.println(result);

}
}