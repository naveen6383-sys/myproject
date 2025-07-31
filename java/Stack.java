import java.util.Scanner;

public class Stack {
    int v;
    public Stack (int v)
    {
        this.v = v;
        System.out.println("constructor is created"+this.v);
    }

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of stack values:");
        int value = scan.nextInt();
        Stack st = new Stack(value);




    }
    
}
