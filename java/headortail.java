import java.util.Random;
import java.util.Scanner;
public class headortail{
    public static void main(String args[])
    {
        Random random = new Random();
        boolean value = random.nextBoolean();
        String value1 ;
        if(value )
        {
             value1 = "head";
            
        }
        else{
            value1 = "tail";
        }
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter heads or tails:");
        String predict = scan.nextLine();
        if(value1.equalsIgnoreCase(predict))
        {
            System.out.println("you predicted right:"+value1);

        }
        else{
            System.out.println("You predicted wrong :"+value1);
        }
    }
}