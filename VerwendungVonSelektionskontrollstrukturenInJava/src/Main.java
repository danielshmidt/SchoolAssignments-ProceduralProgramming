import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aufgabe1();
        //Aufgabe2();
        //Aufgabe3();
        //Aufgabe4();
    }

    public static void Aufgabe1(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");


        int eingelegteWaren, maximaleWare;
        String bezeichung;


        System.out.println("Was ist der Wert für die eingelegte Waren");
        eingelegteWaren = sc.nextInt();

        System.out.println("Was ist die maximal Mögliche Ware?");
        maximaleWare = sc.nextInt();

        System.out.println("Wie heißt die Ware (Bezeichnung)");
        bezeichung = sc.next();

        sc.close();

        if (eingelegteWaren < maximaleWare && !bezeichung.isEmpty()){
            eingelegteWaren++;
            System.out.println("Ware kann eingelegt werden");
        }
        else {
            System.out.println("Ware kann nicht eingelegt werden");
        }
    }

    public static void Aufgabe2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Monatszahl aus:");
        int monatsNummer = sc.nextInt();
        sc.close();

        switch (monatsNummer)  {
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Dezember");
                break;
        }
    }

    public static void Aufgabe3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");

        int zahlZuPruefen = sc.nextInt();
        if(zahlZuPruefen < 100000 && zahlZuPruefen > 9999) {

            if( zahlZuPruefen % 3 != 0 || zahlZuPruefen % 5 != 0 || zahlZuPruefen % 7 != 0) {
                int zehntausenderStelle = zahlZuPruefen % 10;
                int tausenderStelle = (zahlZuPruefen / 10) % 10;
                int hunderteStelle = (zahlZuPruefen/100) % 10;
                int zehnerStelle = (zahlZuPruefen/1000) % 10;
                int einserStelle = (zahlZuPruefen/10000 )% 10;

                if (einserStelle == zehntausenderStelle) {
                    if (einserStelle+zehnerStelle+hunderteStelle+tausenderStelle+zehntausenderStelle % 7 != 0){
                        System.out.println("Zahl bueno");
                    }
                    else {
                        System.out.println("Checksum not righto");
                    }
                }
                else {
                    System.out.println("Erste und Letzte Zahl stimmen nicht überein.");
                }

            }
            else {
                System.out.println("Zahl ist durch 3,5 oder 7 teilbar");
            }
        }
        else
        {
            System.out.println("Zahl ist keine fünfstellige Zahl");
        }
        sc.close();
    }

    public static void Aufgabe4(){Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein!: ");
        int wuerfelZahl = sc.nextInt();
        Random randomGenerator = new Random();
        int randomNumber;

        switch (wuerfelZahl) {
            case 1:
                wuerfelEins();
                break;
            case 2:
                randomNumber = randomGenerator.nextInt(1)+1;
                wuerfelZwei();
                break;
            case 3:
                wuerfelDrei();
                break;
            case 4:
                wuerfelVier();
                break;
            case 5:
                wuerfelFuenf();
                break;
            case 6:
                wuerfelSechs();
                break;
            case 7:
                randomNumber = randomGenerator.nextInt(2)+1;
                switch (randomNumber){
                    case 1:
                        wuerfelSechs();
                        wuerfelEins();
                        break;
                    case 2:
                        wuerfelFuenf();
                        wuerfelZwei();
                        break;
                    case 3:
                        wuerfelDrei();
                        wuerfelVier();
                        break;
                }
                break;
            case 8:
                randomNumber = randomGenerator.nextInt(2)+1;
                switch (randomNumber){
                    case 1:
                        wuerfelSechs();
                        wuerfelZwei();
                        break;
                    case 2:
                        wuerfelFuenf();
                        wuerfelDrei();
                        break;
                    case 3:
                        wuerfelVier();
                        wuerfelVier();
                        break;
                }
                break;
            case 9:
                randomNumber = randomGenerator.nextInt(1)+1;
                switch (randomNumber){
                    case 1:
                        wuerfelSechs();
                        wuerfelDrei();
                        break;
                    case 2:
                        wuerfelFuenf();
                        wuerfelVier();
                        break;
                }
                break;
            case 10:
                randomNumber = randomGenerator.nextInt(1)+1;
                switch (randomNumber){
                    case 1:
                        wuerfelSechs();
                        wuerfelVier();
                        break;
                    case 2:
                        wuerfelFuenf();
                        wuerfelFuenf();
                        break;
                }
                break;
            case 11:
                wuerfelSechs();
                wuerfelFuenf();
                break;
            case 12:
                wuerfelSechs();
                wuerfelSechs();
                break;
            default:
                System.out.println("Fehler!");

        }

    }

    public static void wuerfelEins(){

        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("| * |");
        System.out.println("|   |");
        System.out.println("-----");

    }

    public static void wuerfelZwei(){

        System.out.println("-----");
        System.out.println("|*  |");
        System.out.println("|   |");
        System.out.println("|  *|");
        System.out.println("-----");

    }
    public static void wuerfelDrei(){

        System.out.println("-----");
        System.out.println("|*  |");
        System.out.println("| * |");
        System.out.println("|  *|");
        System.out.println("-----");

    }
    public static void wuerfelVier(){

        System.out.println("-----");
        System.out.println("|* *|");
        System.out.println("|   |");
        System.out.println("|* *|");
        System.out.println("-----");

    }
    public static void wuerfelFuenf(){

        System.out.println("-----");
        System.out.println("|* *|");
        System.out.println("| * |");
        System.out.println("|* *|");
        System.out.println("-----");

    }
    public static void wuerfelSechs(){
        System.out.println("-----");
        System.out.println("|* *|");
        System.out.println("|* *|");
        System.out.println("|* *|");
        System.out.println("-----");
    }
}