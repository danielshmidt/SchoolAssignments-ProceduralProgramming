import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Autokauf();
        //IHKAS_Aufgabe1();
        //IHKAS_Aufgabe2();
        //RechnungMitVars();
    }

    public static void Autokauf(){
        final double mwst = 1.19;

        double basisPreis = 48000;
        double zusatzAusstattung = 8343.22;
        double aktionsPrämie = 1500;

        System.out.print("Das Preis für das Auto wäre: ");
        System.out.println((basisPreis + zusatzAusstattung - aktionsPrämie) * mwst);
    }

    public static void IHKAS_Aufgabe1(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");


        final int eisenBestand = 500;
        System.out.println("Geben Sie den Lagerbestand an.");
        double Lagerbestand = scanner.nextDouble();
        System.out.println("Geben Sie die Gesamtlänge der Netzkabel ein.");
        double gesamtlängeNetzkabel = scanner.nextDouble();

        final double Verschnitt = 1.10;

        System.out.println("Es müssen noch " + (Lagerbestand - gesamtlängeNetzkabel - eisenBestand * Verschnitt * (-1)) + " Meter Kabel bestellt werden");
        scanner.close();
    }

    public static void IHKAS_Aufgabe2(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("Geben sie eine Minutenzahl an:");
        double Minutenzahl = scanner.nextDouble();
        System.out.println((Math.round(Minutenzahl) / 60 % 60) + ":" + (int)(Minutenzahl % 60));

        scanner.close();
    }

    public static void RechnungMitVars(){
        final double mwst = 1.19;

        double bruttoGehalt = 3844.48;
        double prämie = 57;
        final double verkaufteFahrzeuge = 8;
        System.out.print("Bruttoumsatzgehalt: ");
        System.out.println(prämie * verkaufteFahrzeuge + bruttoGehalt);

        double gesamtPreis = 8437.13;
        double reifenGesamt = 100;
        final double marge = 4;
        final double aufschlag = 1.30;
        System.out.print("Der Preis für die Reifen wäre: ");
        System.out.println((((gesamtPreis / reifenGesamt) * marge) * aufschlag) * mwst);
    }
}