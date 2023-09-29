class NonStatic
{

static void imstat()
{
System.out.println("Im inside static");
}

void metoons()
{
System.out.println("Inside metoons");
imstat();
}

void nonsmeth()
{
System.out.println("Inside nonsmeth.");
metoons();
}

public static void main(String [] args)
{
NonStatic ns = new NonStatic();
ns.nonsmeth();
}

}