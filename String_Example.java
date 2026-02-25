public class String_Example {
    public static void main(String[] args) {
       /* String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "How are you buddy!";
        return greeting;*/
        /*int ans = sum3(3,4);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum = a + b;
        return sum;*/
        String personalised = myGreet("Akshat Tripathi");
        System.out.println(personalised);

    }
    static String myGreet(String Name) {
        String message = "Hello " + Name;
        return message;

    }

}