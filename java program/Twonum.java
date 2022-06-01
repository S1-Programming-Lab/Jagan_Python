import java.util.Scanner;
public class Twonum {

    public static void main(String[] args) {
        
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        n1 = sc.nextInt();
       	System.out.println("Enter 2nd Number: ");
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.println("Sum: "+sum);
    }
}
