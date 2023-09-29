class SuperClass
{
	int tyre;
	int gear;
	int milage;
	/*
	SuperClass(int t, int g, int m)
	{
		tyre = t;
		gear = g;
		milage = m;
	}
	SuperClass()
	{
		tyre = 0;
		gear = 0;
		milage = 0;
	}
	*/
}

class SubClass extends SuperClass
{
	int speed;
	SubClass(int t, int g, int m, int s)
	{
		tyre = t;
		gear = g;
		milage = m;
		speed = s;
	}
}

public class InheritanceEg
{
public static void main(String [] args)
{

SubClass sub = new SubClass(4,5,60,100);
SuperClass sup = new SuperClass();
// assigning sub class reference to super class
sup = sub;
System.out.println(sub.tyre + " " + sub.gear + " " + sub.milage + " " + sub.speed);
// System.out.println(sup.tyre + " " + sup.gear + " " + sup.milage + " " + sup.speed);  //error will be thrown
// speed is instance variable of sub class, it cannot access by super class.
System.out.println(sup.tyre + " " + sup.gear + " " + sup.milage);
}
}