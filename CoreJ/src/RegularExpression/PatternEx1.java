package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx1 {
 public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("ab");
	Matcher m=p.matcher("abbabbbabab");
	while(m.find()) {
		count++;
		System.out.println(m.end()+"===>"+m.end()+"=====>"+m.group());
	}
	System.out.println(count);
	
	System.out.println("<========<==========>======>");
	Pattern p1=Pattern.compile("\\W");//" \S,\w,\W,\d,\D
	Matcher m1=p1.matcher("1 #gdj 4");
	while(m1.find()) {
		
		System.out.println(m1.start()+"===>"+m1.end()+"=====>"+m1.group());
	}
		
	//Quatifiers
	System.out.println("<========<=====qualifier=====>======>");
	Pattern p2=Pattern.compile("a*");//[abc],[a+
	Matcher m2=p2.matcher("abaababbaa");
	while(m2.find()) {
		
		System.out.println(m2.start()+"===>"+m2.end()+"=====>"+m2.group());
	}
	 System.out.println("<<=======<>==========>");
	//split()method(Pattern Class)
	   Pattern p3=Pattern.compile("\\s");//respect on space
	  String[] sarr=p3.split("I am myself");
	   for(String s:sarr) {
		   System.out.println(s);
	   }
	   System.out.println("<<=======<>==========>");
	   Pattern p4=Pattern.compile("\\.");//respect on" ." or dot
	  String[] sarr1=p4.split("www.google.com");
	   for(String s1:sarr1) {
		   System.out.println(s1);
	   }
	   System.out.println("<<=======<>==========>");
	   
	 //split()method(String Class)
	  String str="Split respect depend on space";
	  String[] s=str.split("\\s");
	   for(String s1:s) {
		   System.out.println(s1);
	   }
	   
	  

}
}
