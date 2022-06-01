import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Sort{
public static void main(String args[]){
int i,j;
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of words");
int num = sc.nextInt();
String word[]=new String[num];


sc.nextLine();
for (i=0;i<num;i++){
System.out.println("enter thee words");
	word[i]=sc.nextLine();
	}

for(i=0;i<num-1;i++){
	for(j=i+1;j<num;j++){
		if(word[i].compareTo(word[j])>0){
		String temp = word[i];
		word[i]=word[j];
		word[j]=temp;
		}
	}
}
System.out.println("sorted strings is="+ Arrays.toString(word));

}  
}
