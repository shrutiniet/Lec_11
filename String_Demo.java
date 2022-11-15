package Lec_11;
import java.util.*;
public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="Hello Shruti";
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
