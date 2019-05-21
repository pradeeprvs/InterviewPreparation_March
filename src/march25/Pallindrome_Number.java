package march25;

public class Pallindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=152,temp=n, rem,sum=0;

		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=rem+(sum*10);
		}
		if(temp==sum) {
			System.out.println("Given Number is a Pallindrome");
		}
		else
			System.out.println("Not a Pallindrome");
	}

}
