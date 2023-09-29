class OverloadDemo {
 void test() {
 System.out.println("No parameters");
 }
 // Overload test for two integer parameters.
 void test(int a, int b) {
 System.out.println("a and b: " + a + " " + b);
 }
 // Overload test for a double parameter
 void test(double a, double b) {
 System.out.println("Inside test(double): " + a +" "+ b);
 }

}
class Overload {
 public static void main(String args[]) {
 OverloadDemo ob = new OverloadDemo();
 double i,j;
 i=j=88.0;
 ob.test();
 ob.test(10, 20);
 ob.test(10,(int)i); // this will invoke test(double)
 // ob.test(123.2); // this will invoke test(double)
 }
}