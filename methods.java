import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
   /* static void sum() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        System.out.println(sum);*/
    }

