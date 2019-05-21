package march25;

public class ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=154,rem,sum=0,temp=n;

		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum) {
			System.out.println("Given Number is Armstrong");
		}
		else
			System.out.println("Not an Armstrong Number");
	}
}
