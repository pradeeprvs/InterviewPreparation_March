package march25;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring Required Variables
		int n=2,m=n/2, rem=0,count=0;
		for(int i=1;i<m;i++) {
			if(n%i==0) {
				rem=n%i;
				count++;
				System.out.println("The remainder is "+n +"%"+i + " = " +rem+ " and the value of count is "+count);
			}
		}
		if (count<2) {
			System.out.println("Given "+n+" is a Prime");
		}
		else
			System.out.println("Given "+n+" not a Prime");
	}
}
