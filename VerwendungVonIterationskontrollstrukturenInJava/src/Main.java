import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aufgabe1();
        //Aufgabe2();
        //Aufgabe3();
        //Aufgabe4();
        //Aufgabe5();
    }

    public static void Aufgabe1(){
        String password;
        boolean loginGoode = false;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");


        for (int anzahl = 0; anzahl<3; anzahl++)
        {
            password = sc.next();
            System.out.println(anzahl);
            if (!password.equals("HNBK")){
                System.out.println("falsch");
                continue;
            }
            else {
                loginGoode = true;
                System.out.println("Login Good?: " + loginGoode);
                break;
            }

        }
    }

    public static void Aufgabe2(){
        Scanner sc = new Scanner(System.in);

        double monatseinnahmen =0.0;
        double tageseinnahmen ;

        for (int anzahl = 0; anzahl<31; anzahl++){
            tageseinnahmen = sc .nextDouble () ;
            monatseinnahmen += tageseinnahmen ;
            System.out.println("Die akutellen Monatseingaben betragen: " + monatseinnahmen);
        }
        sc.close();
    }

    public static void Aufgabe3(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        double einnahmen = 0.0;
        do{
            einnahmen = scanner . nextDouble () ;

        }while (einnahmen > 10000);
    }

    public static void Aufgabe4(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        int zahl = scanner . nextInt () ;
        boolean primzahl = true ;
        while (primzahl == true){
            if ( zahl % (zahl/2) == 0) {
                primzahl = false ;
                break ;
            }
        }
    }

    public static void Aufgabe5(){
        int minutenanzahl;
        int stundenanzahl;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        do{
            minutenanzahl = scanner.nextInt();
        }while (minutenanzahl != 0);

        stundenanzahl = minutenanzahl / 60;
    }
}