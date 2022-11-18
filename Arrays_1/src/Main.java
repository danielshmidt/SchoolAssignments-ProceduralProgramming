import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    Aufgabe1();
    //    Aufgabe2();
    //    Aufgabe3();
    }

    public static void Aufgabe1(){
        String[] Mitarbeiter = new String[5];
        Mitarbeiter[0] = "Kurt Gertius";
        Mitarbeiter[1] = "Anna Wurtele";
        Mitarbeiter[2] = "Hajo Obermaier";
        Mitarbeiter[3] = "Jörg Advocat";
        Mitarbeiter[4] = "Nicole Dulon";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Geben Sie eine Mitarbeiter-ID ein: ");
        int MID = sc.nextInt();
        sc.close();
        if(MID <= Mitarbeiter.length) {
            System.out.println("Mitarbeiter-ID: " + MID);
            System.out.println("Mitarbeiter: " + Mitarbeiter[MID - 1]);
        }
        else {
            System.out.println("Ungültige Eingabe");
        }
    }

    public static void Aufgabe2(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        double[] Tagesumsätze = {
                28535.43,
                7899.99,
                10000.00,
                321.34,
                84412.17,
                55000.00,
        };

        for(int i = 0; i <= Tagesumsätze.length-1; i++)
        {
            System.out.println(i+1 + ": " + Tagesumsätze[i]);
        }
    }

    public static void Aufgabe3() {
        int[] zahlen = new int[101];
        int[] andereZahlen = new int[zahlen.length];
        int[] reichtMitDenZahlen = new int[zahlen.length];
        int[] nelhaZ = new int[zahlen.length];
        int i2 = 0;

        for (int i=0; i < zahlen.length; i++){
            zahlen[i] = i;
            System.out.println("Zahlen Array: " + zahlen[i]);
        }

        System.arraycopy(zahlen, 0, andereZahlen, 0, 101);


        for(int i = 0; i < zahlen.length; i++)
        {
            nelhaZ[i] = zahlen[100 - i];
            System.out.println("nelhaZ: " + nelhaZ[i]);
        }

        int[] nochMehrAndereZahlen = Arrays.copyOfRange(zahlen, 20, 81);

        for(int i=0; i < nochMehrAndereZahlen.length; i++){
            System.out.println("Noch mehr Zahlen Array: " + nochMehrAndereZahlen[i]);
        }

        for(int i=0; i < zahlen.length; i+=5){
            reichtMitDenZahlen[i2] = zahlen[i];
            System.out.println("Reicht mit den Zahlen Array: " + reichtMitDenZahlen[i2]);
            i2++;
        }
    }

}