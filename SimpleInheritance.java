class A {
 int i=10, j;
private int y=10;
 void showij() {
 //System.out.println("i and j: " + i + " " + j);
 }
}

// Create a subclass by extending class A.
class B extends A {
 int k;
 void showk() {
 System.out.println("k: " + k);
 }
	void showij(){
	System.out.println("In B");
	super.showij();
	}

 void sum() {
 System.out.println("i+j+k: " + (i+j+k));
 }
}

class SimpleInheritance {
 public static void main(String args []) {

 A superOb = new A();
 B subOb = new B();

 // The superclass may be used by itself.
 superOb.j = 20;
 System.out.println("Contents of superOb: ");
 superOb.showij();
 System.out.println();

 /* The subclass has access to all public members of
 its superclass. */
 subOb.k = 9;
 // System.out.println("Private member access: "+superOb.y + " " +subOb.y); //error
 System.out.println("Contents of subOb: ");
 subOb.showij();
 subOb.showk();
 System.out.println();

 System.out.println("Sum of i, j and k in subOb:");
 subOb.sum();
 }
}