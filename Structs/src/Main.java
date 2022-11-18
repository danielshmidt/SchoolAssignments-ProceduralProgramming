import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Rechnung r = erstelleRechnung(1,1,"1991012", 10.99);
        druckeRechnung(r);
        rabbatiere(r, 2.99);
        druckeRechnung(r);*/

        Rechnung[] rechnung = erstelleSortierteZufallsRechnung();
        System.out.println(binaereSuche(rechnung, 101.0));
        int stelle = binaereSuche(rechnung, 101.0);
        druckeRechnung(rechnung[stelle]);
    }


    public static Rechnung erstelleRechnung(int rechnumm, int kundnumm, String date, double netto) {
        Rechnung rech = new Rechnung();
        rech.Rechnungsnummern = rechnumm;
        rech.Kundennummer = kundnumm;
        rech.Bestelldatum = date;
        rech.Nettopreis = netto;
        return rech;
    }

    public static void druckeRechnung(Rechnung rechnung) {
        System.out.println(
                "Rechnungsnummer: " + rechnung.Rechnungsnummern + "\n" +
                        "Kundennummer: " + rechnung.Kundennummer + "\n" +
                        "Bestelldatum: " + rechnung.Bestelldatum + "\n" +
                        "Nettopreis: " + rechnung.Nettopreis + "\n"
        );
    }

    static void rabbatiere(Rechnung rechnung, double nettorabbat) {
        rechnung.Nettopreis -= nettorabbat;
    }

    public static Rechnung[] erstelleZufallsRechnung() {
        Random rnd = new Random();
        Rechnung[] array = new Rechnung[1000];
        for(int i = 0; i<1000; i++) {
            array[i] = erstelleRechnung(rnd.nextInt(0, 1000), rnd.nextInt(0, 1000), "2022-11-14", rnd.nextInt(0, 1000));
        }
        return array;
    }

    public static Rechnung[] erstelleSortierteZufallsRechnung(){
        Random rnd = new Random();
        Rechnung[] rech = new Rechnung[1000];
        for(int i = 0; i<rech.length; i++) {
            rech[i] = erstelleRechnung(rnd.nextInt(0, 1000), rnd.nextInt(0, 1000), "2022-11-14", i);
        }
        return rech;
    }
    public static int findeNettoBetrag(Rechnung[] rech, double gesuchterBetrag) {
        for (int i = 0; i < rech.length; i++) {
            if (rech[i].Nettopreis == gesuchterBetrag) {
                return i;
            }
        }
        return -1;
    }
    public static int binaereSuche(Rechnung[] rech, double gesuchterBetrag){
        int min = 0;
        int max = rech.length - 1;
        while(min <= max) {
            int mitte = ((max - min) / 2) + min;
            if(rech[mitte].Nettopreis == gesuchterBetrag) {
                return mitte;
            }
            else if (gesuchterBetrag > rech[mitte].Nettopreis) {
                min = ((max - min) / 2) + min;
            }
            else {
                max = ((max - min) / 2) + min;
            }
        }
        return -1;

    }
}