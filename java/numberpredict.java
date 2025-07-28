import java.util.Scanner;
import java.util.Random;
public class numberpredict {
    public static void main(String[] args)
    
    {
    
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    while(true)
    {
        System.out.println("NUMBER PREDICTOR:");
        System.out.println("Do you want to start (yes/no)");
        
        String choice = scan.nextLine();
        if(!choice.equalsIgnoreCase("yes"))
        {
            break;
        }
    
    System.out.println("Enter starting number");
    int start = scan.nextInt();
    System.out.println("Enter ending number:");
    int end = scan.nextInt();
    int value = ran.nextInt(start,end);
    System.out.printf("%nEnter any number from %d-%d:",start,end);
    int predict= scan.nextInt();
    scan.nextLine();
    if(value == predict)
    {
        System.out.println("you predicted correctly"+value);

    } 
    else{
        System.out.println("your prediction is wrong:answer is "+value);
    }

}
}
    
}
