package march25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read_TextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Pradeep R V S\\Desktop\\TextFile.txt"));
		StringBuffer sb= new StringBuffer();
		while((br.readLine())!= null) {
			String str=br.readLine();
			System.out.println("Before  \n"+ str.trim());
			String[] strArr= str.split(" ");
			for(int i=0;i<strArr.length-1;i++) {
				String temp=strArr[i];
				String str2= Character.toUpperCase(temp.charAt(0))+temp.substring(1);
				sb.append(str2+" ");
				System.out.println("After \n"+sb);
			}
		}
	}

}
