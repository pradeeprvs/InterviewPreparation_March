package march25;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=10,n1=0,n2=1,n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<range;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}

}
