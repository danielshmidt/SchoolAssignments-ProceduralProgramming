import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Anzahl der Tageseinnahmen eingeben: ");
        int AnzahlDerTageseinnahmen = sc.nextInt();
        double[] Tageseinnahmen = new double[AnzahlDerTageseinnahmen];
        double gesamtUmsatz = 0;
        double groesterUmsatz = 0;
        double kleinsterUmsatz = 0;

        for(int i=0; i<Tageseinnahmen.length;i++){
            System.out.println("Geben Sie die Einnahmen für den Tag " + i + " ein.");
            Tageseinnahmen[i] = sc.nextDouble();
            gesamtUmsatz += Tageseinnahmen[i];
            kleinsterUmsatz = Tageseinnahmen[i];

            if(groesterUmsatz < Tageseinnahmen[i]){
                groesterUmsatz = Tageseinnahmen[i];
            }
            if(Tageseinnahmen[i] <  kleinsterUmsatz ){
                kleinsterUmsatz = Tageseinnahmen[i];
            }
        }
        sc.close();

        System.out.println("Gesamteinnahmen für " +
                AnzahlDerTageseinnahmen +
                " Tage: " +
                gesamtUmsatz +
                "€");

        System.out.println("Größter Umsatz: " +
                groesterUmsatz +
                "€");

        System.out.println("Kleinster Umsatz: "+
                kleinsterUmsatz +
                "€");

        System.out.println("Durchschnitts Umsatz: " +
                kleinsterUmsatz/AnzahlDerTageseinnahmen+
                "€");



    }
}