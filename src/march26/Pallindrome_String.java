package march26;

public class Pallindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="wow";
		String rev="";
		
		char[] charArr=str.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			rev=rev+charArr[i];
			System.out.println(rev);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given input is a Pallindrome");
		}
	}
}
