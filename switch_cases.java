import java.util.Scanner;
public class switch_cases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.println("Enter a name of a fruit");*/
        /*  String fruits = s.next();
         *//* if(fruits.equals("Mango")){
            System.out.println("King of fruits");
        }
        if(fruits.equals("Apple")) {
            System.out.println("Keeps a Doctor Away");
        }*//* //POOR SYNTAX
        switch (fruits) {
            case ("Mango") -> System.out.println("King of Fruits");
            case ("Apple") -> System.out.println("Keeps a Doctor Away");
            case ("Orange") -> System.out.println("Round Sour Fruit");
            case ("Grapes") -> System.out.println("Small Round Fruit");
            default -> System.out.println("Please enter an Valid fruit");
        }*/
        int day = s.nextInt();
        switch (day) {
            case (1) -> System.out.println("Monday");
            case (2) -> System.out.println("Tuesday");
            case (3) -> System.out.println("Wednesday");
            case (4) -> System.out.println("Thursday");
            case (5) -> System.out.println("Friday");
            case (6) -> System.out.println("Saturday");
            case (7) -> System.out.println("Sunday");
        }
    }
}

                    

