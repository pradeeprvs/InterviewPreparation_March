package march26;

public class LargestNumber_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,22,66,54,87,45,11};
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}System.out.println("Largest "+largest+" Smallest : "+smallest);
	}

}
