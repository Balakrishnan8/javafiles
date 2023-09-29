class Rotate
{ 

public static int fun(int dd, int dv)
{
int q;
if(dv<0){
 dv = -dv;
 q = fun(dd,dv);
 return -q;
}
else if(dd<0){
 dd = -dd;
System.out.println(dd);
 q = fun(dd,dv);
 return -q-1;
}
else{
return d(dd,dv);
}

}

     public static int d(int dd, int dv)
    {
        int rem = dd;
        int quo = 0;
        while(rem>=dv)
        {
            rem-=dv;
            quo++;
        }
        return quo;
    }

    public static void main(String [] args) {
        System.out.println(fun(-2147483648,-1));
        System.out.println(fun(-2147483648,1));
    }
}
