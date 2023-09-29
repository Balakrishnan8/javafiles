class MyException extends Exception {
	private int detail;
	MyException(int a) {
		detail = a;
	}
	public String toString() {
		return "MyException[" + detail + "]";
	}
	public String getMessage() {
		return "It is greater than specified";
	}
	// public void printStackTrace() {
	// 	System.out.println(toString() + ":" + getMessage() );
	// }
}

class ExceptionDemo {
	static void compute(int a) throws MyException {
		System.out.println("Called compute(" + a + ")");
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}

	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		} 
		catch (MyException e) {
			System.out.println("Caught " + e.getMessage());
			// System.out.println(e.printStackTrace());
		}
	}
}