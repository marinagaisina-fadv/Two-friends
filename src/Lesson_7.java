public class Lesson_7 {

    int a;
    int b;

    public static int sum(int a, int b){
        int c =a+b;
        return c;
    }

    public static void sub(int a, int b) {
        System.out.println(a -b);
    }
    public static double mult(double a, double b){
        double c =a * b;
        return c;
    }
     public static void dev( int a, int b){
         System.out.println(a/b);
     }


    public static void main(String[] args) {
        System.out.println( sum(10,6));
        sub(6,9);
        System.out.println(mult(3.4, 5.6));
        dev(100, 2);

    }
}
