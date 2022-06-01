import java.util.*;
public class manp{
public static void main(String args[]){
System.out.println("enter the string");
Scanner sc= new Scanner(System.in);
String str1 = sc.nextLine();
String con;
	String s = "Hello ";
con=s.concat(str1);
System.out.println("concationation:="+con);
	System.out.println("lenth of the string="+str1.length());
	System.out.println("character at first postion="+str1.charAt(0));
	System.out.println("String contains 'col' sequence:"+str1.contains("col"));
	System.out.println("String ends with e :="+str1.endsWith("e"));
	System.out.println("replace 'col' with 'kol':"+str1.replaceAll("col","kol"));
	System.out.println("lowercase:"+str1.toLowerCase());
	System.out.println("uppercase:"+str1.toUpperCase());

}


}
