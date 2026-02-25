public class Overloading {
    public static void main(String[] args) {
       /* fum(3);
        fum("Akshat Tripathi");
    }
    static void fum(int a){
        System.out.println(a);
    }
    static void fum(String name){
        System.out.println(name);
    }*/
        int ans= sum(2, 4);
        System.out.println(ans);
        int ans1 = sum(3, 5, 7);
        System.out.println(ans1);

    }
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a,int b,int c){
        return a + b + c;
    }

}