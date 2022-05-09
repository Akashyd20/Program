//Program to reverse a string using StringBuffer


package Basic;

public class StrBuffer {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer("hello");
			char hello;
			String rev="";
			for(int i=0;i<sb.length();i++)
			{
				hello=sb.charAt(sb.length()-1-i);
				rev= rev+hello;
			}
			System.out.println(rev);

		}


}
