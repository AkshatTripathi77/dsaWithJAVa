import java.util.Scanner;

public class conditionalstatements {
    public static void main(String[] args) {
        System.out.println("Enter Your Salary");
        Scanner Input = new Scanner(System.in);
        Float Salary = Input.nextFloat();
        // float Salary = 24000f;
        // Basic if-Else
        // if(Salary > 20000f){
        //        Salary = Salary + 2000;
        //  }else{
        //      Salary = Salary + 1000;
        //   }
        // System.out.println(Salary);
        // Multiple If else statement
        if (Salary < 10000) {
            Salary += 1000;
        } else if (Salary == 10000) {
            Salary += 2000;
        } else {
            Salary += 25000;
        }
        System.out.println(Salary);
    }
}








