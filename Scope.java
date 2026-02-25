public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
       // System.out.println(marks);// Cannot access due to limited scope
    }
    static void Random(int marks){
      // System.out.println(a); Can't access the a because of limited scope
        int num = 78;
        System.out.println(num);
        System.out.println(marks);
    }
}
