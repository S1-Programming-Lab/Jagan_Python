
import java.io.*;
import java.util.Scanner;
public class driver{
	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower limit");
		int x=sc.nextInt();
		System.out.println("enter the upper limit");
		int y=sc.nextInt();
		Runnable r = new fibonacci(x,y);
		Thread obj1=new Thread(r);
		obj1.start();
		Runnable p=new even(x,y);
		Thread obj2=new Thread(p);
		obj2.start();
		}
}

 class even implements Runnable{
	int n1;
	int n2;
	even (int x, int y){
	n1=x;
	n2 = y;
}
	public void run(){
	 for(int i=n1;i<=n2;i++){
		if(i%2 == 0){
			System.out.println("even ="+i);

		}	
	}}
}

class fibonacci implements Runnable{
int n1;
int n2;
int num=0;
int x=0;
int y=1;
	fibonacci(int i,int u){
	n1=i;
	n2=u;
	}
public void run(){
System.out.println("fibannoci="+0);
System.out.println("fibonacci="+1);
	while(num<n2-1){
	num=x+y;
		if ((num>=n1) && (num<=n2)){
		System.out.println("fibonacci="+num);
			}
x=y;
y=num;
		}
	}
}
