import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("Wer ist der Hersteller des Autos?:");
        String Hersteller = scanner.next();

        System.out.println("Was für ein Modell hat das Auto?");
        String Modell = scanner.next();

        System.out.println("Wann wurde das Auto gebaut?");
        short Baujahr = scanner.nextShort();

        System.out.println("Was für ein Kilometer Stand hat das Auto");
        int kmStand = scanner.nextInt();

        System.out.println("Für wie viel willst du das Auto verkaufen (Wichtig! Anstatt , bitte . verwenden!)");
        BigDecimal Verkaufspreis = new BigDecimal(scanner.next());

        System.out.println("Welche Farbe hat das Auto");
        String Farbe = scanner.next();

        System.out.println("Was für eine Antriebsart hat das Auto?");
        char Antriebsart = scanner.next().charAt(0);

        System.out.println("Hat das auto eine Händlergarantie? (true oder False)");
        boolean mitHaendlergarantie = scanner.nextBoolean();
        scanner.close();

        System.out.println("Hersteller: " + Hersteller + "; "
                + "Modell: " + Modell + "; "
                + "Baujahr: " + Baujahr + "; "
                + "km-Stand: " + kmStand + "; "
                + "Verkaufspreis: " + Verkaufspreis + "; "
                + "Farbe: " + Farbe + "; "
                + "Antriebsart: " + Antriebsart + "; "
                + "Händlergarantie: " + mitHaendlergarantie);
    }
}