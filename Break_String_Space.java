package Lec_11;
import java.util.*;
public class Break_String_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="the sky is blue";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ' || i==0)
			{
				if(i==0)
					i=-1;
				int idx=i;
				for(int k=idx+1;(k<=str.length()-1 && str.charAt(k)!=' ');k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

}
