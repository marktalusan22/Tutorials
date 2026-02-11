import java.util.Scanner;
public class OddEven {
    public static void main(String Mark[] ) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int i = input.nextInt();
        
        if (i % 2 == 0) {
            System.out.println("You entered an Even No.");
        } else {
            System.out.println("You entered an Odd No.");
        }
    }
}