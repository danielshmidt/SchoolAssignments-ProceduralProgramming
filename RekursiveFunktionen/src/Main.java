import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Aufgabe1();
        //Aufgabe2();
    }

    public static void Aufgabe1(){
        Random rnd = new Random();
        System.out.println(ggT(rnd.nextInt(Integer.MAX_VALUE-1), rnd.nextInt(Integer.MAX_VALUE-1)));
    }

    public static void Aufgabe2(){
        for(int i = 1; i <= 50; i++){
            System.out.println(Fib(i));}
    }

    static int ggT (int a, int b){

        if (a == b){
            return a;
        } else if (a > b) {
            return ggT(a-b,b);
        } else {
            return ggT(b-a, a);
        }
}

    static int Fib(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return Fib(n-2) + Fib(n-1);
        }

    }

    static int ack(int n, int m){
        if (n == 0)
            return m + 1;
        else if (m == 0)
            return ack(n - 1, 1);
        else
            return ack(n - 1, ack(n, m - 1));
    }

}
