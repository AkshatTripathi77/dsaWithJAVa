import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a valid Id of an Employee");
        int EmpId = s.nextInt();
        System.out.println("Enter Department of an Employee");
        String Dept = s.next();
        switch (EmpId) {
            case (1) -> System.out.println("Akshat Tripathi");
            case (2) -> System.out.println("Aryan Chaudhary");
            case (3) -> System.out.println("Ashish Mishra");
            case (4) -> {
                switch (Dept) {
                    case "IT":
                        System.out.println("IT department");
                    case "Management":
                        System.out.println("Management department");
                    default:
                        System.out.println("Wrong Department");
                }
            }
            default -> System.out.println("Wrong Employee Id");
        }
    }
}
