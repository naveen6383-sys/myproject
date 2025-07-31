import java.util.Scanner;

public class Stack {
    int v;
    int[] arr;
    int top=-1;
    public Stack (int v)
    {
        this.v = v;
        this.arr = new int[v];
        System.out.println("constructor is created"+this.v);

    }
    public void push (int data)
    {
        top = top+1;
        arr[top]=data;
        System.out.print(data+"is added");

    }
    public int pop()
    {
    
        int data = arr[top];
        top = top-1;
        return data;
    }




    public static void main(String [] args)
    {
        int d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of stack values:");
        int value = scan.nextInt();
        Stack st = new Stack(value);
        for(int i=0;i<value;i++)
        {
            System.out.print("\n Enter element "+ (i+1));
            d = scan.nextInt();
            st.push(d);
        }
        for(int i=0;i<value;i++)
        {
            System.out.println(st.pop()+"  value is removed");
        }




    }
    
}
