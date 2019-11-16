package RegularExpression;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st=new StringTokenizer("Test my first example");//default regular expression space
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());

		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		StringTokenizer st1=new StringTokenizer("right", "g");//default regular expression space//(terget,delimeter)
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken());

		}
	}
}
