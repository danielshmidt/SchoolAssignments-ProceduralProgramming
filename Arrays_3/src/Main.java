import java.util.Random;

public class Main {
    public static void main(String[] args) {
    //    Aufgabe1();
    //    Aufgabe2();
    }

    public static void Aufgabe1(){
        double[][] dayAndMonth = new double[12][31];

        Random rnd = new Random();
        for(int i=0; i<dayAndMonth.length;i++){
            System.out.println("Geben Sie den Tagesbeitrag für tag " + i);
            // dayAndMonth[i] = rnd.nextDouble();
        }
    }

    public static void Aufgabe2(){
        char[][] goode =
                {
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},
                        {'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H',},
                        {'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H',},
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},
                        {'H', 'H', ' ', ' ', ' ', ' ', 'H', 'H',},

                };

        for (int i = 0; i < goode.length; i++) {
            for (int x=0; x < goode[i].length; x++){
                System.out.print(goode[i][x] + "");
            }
            System.out.println();
        }
    }
}