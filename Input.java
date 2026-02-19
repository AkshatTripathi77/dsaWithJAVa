import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Please Enter some input");
        Scanner input = new Scanner(System.in);
        int  roll= input.nextInt();
        System.out.println("Your Roll number is "+roll);

    }
}
