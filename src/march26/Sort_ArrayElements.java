package march26;

public class Sort_ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,22,66,54,87,45,11},temp;

		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0; i < a.length; i++) {     
			System.out.print(a[i] + " ");    
		}    
	}

}
