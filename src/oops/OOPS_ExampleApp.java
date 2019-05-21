package oops;

class Product{
	private int pid;
	private String name;
	private int price;

	Product(){
		System.out.println("This is Product-Parent Default Constructor");
	}



	public Product(int pid, String name, int price) {
		super();
		System.out.println("This is Product-Parent's parameterised constructor");
		this.pid = pid;
		this.name = name;
		this.price = price;
	}



	public void setValues(int pid,String name,int price) {
		System.out.println("I am from the Product class");
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public void showValues() {
		System.out.println("The Product ID is : "+pid);
		System.out.println("The Product Name is : "+name);
		System.out.println("The Product price is : "+price);
	}

}


class Mobile_Phone extends Product{
	private int ram;
	private String os;
	private boolean sd_Card;
	private int pid;
	private String name;
	private int price;
	
	Mobile_Phone(){
		System.out.println("Mobile Phone Child class-Default Constructor is called");
	}

	public Mobile_Phone(int ram, String os, boolean sd_Card) {
		super();
		System.out.println("Mobile Phone Child class-Parameterised Constructor is called");
		this.ram = ram;
		this.os = os;
		this.sd_Card = sd_Card;
	}
	public void setValues(int pid,String name,int price,int ram, String os, boolean sd_Card) {
		System.out.println("I am from the Mobile Phone class");
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.ram=ram;
		this.os=os;
		this.sd_Card=sd_Card;
	}
	
	public void showValues() {
		System.out.println("The Mobile ID is : "+pid);
		System.out.println("The Mobile Name is : "+name);
		System.out.println("The Mobile price is : "+price);
		System.out.println("The Mobile ram is : "+ram);
		System.out.println("The Mobile os is : "+os);
		System.out.println("The Mobile suppoprts sd card  : "+sd_Card);
	}

	
}


public class OOPS_ExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(20, "LCD TV", 400000);
		//p.setValues(10, "LED TV", 40000);
		p.showValues();
		
		Mobile_Phone m= new Mobile_Phone();
		m.setValues(21, "Samsung S9+", 80000);
		m.showValues();
		m.setValues(22, "Sony Xperia", 100000, 2 , "Android", true);
		m.showValues();
	}

}
