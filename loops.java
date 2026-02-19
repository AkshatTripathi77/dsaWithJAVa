import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
// Basic For loop program
      /*  for (int num = 1;num <=5;num++){
            System.out.println(num);

        }*/
       /* System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");

        }*/
        // While loop
        int  num = 1;
        while(num <=5 ){
            System.out.print(num + " ");
            num++;
        }
        //DoWhileLoop
        int n = 1;
        do {
            System.out.println("Hello World");
            n++;
        }while(n!= 1 );//Infinite loop

    }
}
