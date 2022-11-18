import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aufgabe1();
        //Aufgabe2();

    }


    public static void Aufgabe1(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Anzahl der Tageseinnahmen eingeben: ");
        int AnzahlDerTageseinnahmen = sc.nextInt();
        int[] Tageseinnahmen = new int[AnzahlDerTageseinnahmen];

        for(int i=0; i<Tageseinnahmen.length;i++){
            System.out.println("Geben Sie die Einnahmen für den Tag " + i + " ein.");
            Tageseinnahmen[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(sum(Tageseinnahmen));
        System.out.println(biggest(Tageseinnahmen));
        System.out.println(avg(Tageseinnahmen));
    }

    public static void Aufgabe2(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Geben Sie den Wert für p ein: ");
        double eingabeP = sc.nextDouble();

        System.out.println("Geben Sie den Wert für q ein: ");
        double eingabeQ = sc.nextDouble();

        sc.close();

        double[] pq = pqFormel(eingabeP,eingabeQ);

        System.out.println(pq[0]);
        System.out.println(pq[1]);
    }

    static double[] pqFormel(double p, double q){
        double D = Math.pow((p/2),2)-q;
        double[] x = new double[2];
        x[0] = -(p/2) + Math.sqrt(D);
        x[1] = -(p/2) - Math.sqrt(D);
        return x;
    }

    static int sum(int[] array){
        int summe = 0;
        for (int kek: array) {
            summe += kek;
        }
        return summe;

    }

    static int biggest(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int kek : array) {
            if (max < kek) {
                max = kek;
            }
        }
        return max;
    }

    static int avg(int[] array){
        return sum(array)/ array.length;
    }
}