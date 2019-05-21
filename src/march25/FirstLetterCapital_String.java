package march25;

public class FirstLetterCapital_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line="hi I am pradeep. i am doing fine";
		 StringBuilder sb=new StringBuilder();

		String[] strArray= line.split(" ");

		for(int i=0;i<strArray.length;i++) {
			String str=strArray[i];
			//System.out.println("I have currently : "+str);
			String toUpper= Character.toUpperCase(str.charAt(0))+str.substring(1);
			sb.append(toUpper+" ");
			System.out.println(sb);
		}
	}


}
