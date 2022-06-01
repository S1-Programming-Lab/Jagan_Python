import java.util.*;
class operataions{
	public void operations()
{
int top=-1,ch,n,e;
Scanner inp = new Scanner(System.in);
System.out.println("enter the size of stack");
b = inp.nextInt();
int size=n-1;
int[] arr= new int[n];

	do{
	System.out.println("\n menu:\n 1.push \n 2.pop  \n 3.display \n 4.exit");
	System.out.println("enter your choice");
	ch = inp.nextInt();
	switch(ch)
	{
	case 1:if(top==size){
		System.out.println("***stack is full***");
}
		else
		{
			System.out.println("enter element");
			e=inp.nextInt();
			top++;
			arr[top]=e;
			}
			break;
	case 2:if(top==-1){
		System.out.println("\n *** stack is empty ***");
		}
		else{
		System.out.println("\n" + arr[top] + "is removed");
		top--;
		}
		break;
		case 3: if(top==-1){
		System.out.println("*** stack is empty**");	
		}
		else{
		System.out.println("*** stack***");
		for(int i=top;i>=0;i++)
		{
		System.out.println("  "+arr[i]);
		System.out.println("_____");
		}
		}
		break;
		case 4:System.exit(0);
		default:System.out.println("ivalid Choice");		
			}	
		}while(ch !=4);
}
}
class driver{
public static void main(String[] args){
operations obj = new operations();
obj.operations();
}
}
