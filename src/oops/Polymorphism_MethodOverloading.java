package oops;

public class Polymorphism_MethodOverloading {


	void add(int num1, float num2) {
		System.out.println("The summation of 2 numbers : " + (num1 + num2));
	}

	void add(float num1, int num2) {
		System.out.println("Static &amp;gt;&amp;gt; The summation of 2 numbers : " + (num1 + num2));
	}

	void add(double num1, float num2, long num3) {
		System.out.println("The summation of 3 numbers : " + (num1 + num2 + num3));
	}

	void add(int num1, float num2, double num3) {
		System.out.println("The summation of 3 numbers : " + (num1 + num2 + num3));
	}

	public static void main(String args[]) {

		Polymorphism_MethodOverloading t1 = new Polymorphism_MethodOverloading();
		t1.add(12, 16f);        // method call to 2 input parameters list (different data type or order)
		t1.add(5f, 9);          // method call to 2 input parameters list (different data type or order)
		t1.add(20d, 10f, 40l);  // method call to 3 input parameters list (different data type or order)
		t1.add(10, 20f, 30d);   // method call to 3 input parameters list (different data type or order)

	}

}
