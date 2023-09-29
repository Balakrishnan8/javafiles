class Divide{
    public static int divide(int dividend, int divisor) {
        int count=0;

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        System.out.println(a + " " + b);

        while(a>=b)
        {
            // System.out.println(a + " " + b);
            a-=b;
            count++;
        }
        if(dividend<0 || divisor<0)
            return -count;
        else
            return count;

    }
	public static void main(String [] args)
{
	
System.out.println(divide(-2147483647,1));
System.out.println(-2147483648>>>32);

System.out.println(-10/-3);
}
}