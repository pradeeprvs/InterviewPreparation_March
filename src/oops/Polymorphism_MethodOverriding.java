package oops;


class Shape{
	
	Shape(){
		System.out.println("Constructor from Parent Class : Shape");
	}
	
	protected void draw() throws Exception {
		System.out.println("I am drawing a shape from Parent class");
	}
}

class Circle extends Shape{
	Circle(){
		System.out.println("Constructor from Child Class : Circle");
	}
	public void draw() {
		System.out.println("I am drawing a shape of circle from Child class");
	}
}

public class Polymorphism_MethodOverriding {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		Circle c=new Circle();
//		c.draw();
		
		Shape s=new Circle();
		s.draw();

	}

}
