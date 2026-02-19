import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int a = s.nextInt();
        System.out.println("Enter The 2nd Number");
        int b = s.nextInt();
        System.out.println("Enter the 3rd Number");
        int c = s.nextInt();
        if(a>b&&a>c){
            System.out.println(a +" is largest");
        } else if (b>a&&b>c) {
            System.out.println(b +"is largest");
        } else if (c>a&&c>b) {
            System.out.println(c +"is largest");

        }else{
            System.out.println("Re-Enter the numbers");
        }

    }
}
