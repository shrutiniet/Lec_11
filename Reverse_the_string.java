package Lec_11;
import java.util.*;
public class Reverse_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="Hello Shruti";
		String nstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			nstr+=ch;
		}
		System.out.println(nstr);
	}

}
