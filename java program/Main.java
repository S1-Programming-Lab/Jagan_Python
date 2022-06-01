class CPU{

double price;
	CPU(int p){
	price=p;
	}
class processor
	{
int cores;
	String manufacturer;
	processor(int c,String menu)
	{
		cores=c;
		manufacturer=menu;
	}

void display(){
System.out.println("processor cores"+cores);
System.out.println("procesor"+manufacturer);
	}
}
	static class RAM{
	int memory;
	String manufacturer;

RAM(int m, String manufact){
	memory=m;
	manufacturer=manufact;
	}
void disp(){
	System.out.println("ram mmry"+memory);
	System.out.println("manu"+manufacturer);
	}
		}
}


public class Main{
public static void main(String[] args){
CPU cpu = new CPU(400);
CPU.processor processor = cpu.new processor(5,"intel");
CPU.RAM ramobj= new CPU.RAM(2,"intel");
processor.display();
ramobj.disp();
}
}
