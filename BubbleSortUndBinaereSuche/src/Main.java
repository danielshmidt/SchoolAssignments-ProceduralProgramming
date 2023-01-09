public class Main {
    public static void main(String[] args) {

        int[] zahlen = {1, 4, 5, 7, 8, 9, 10, 11, 15};
        int[] zhealn = {10, 7, 11, 4, 8, 15, 1, 11, 15};
       // System.out.println(binarySearch(zahlen, 9));
        int[] s = bubbleSort(zhealn);

        for(int i = 0; i < s.length-1; i++){
            System.out.println(s[i]);
        }
    }

    public static int[] bubbleSort(int[] unsortedZahlen){

        for(int i = 0; i < unsortedZahlen.length-1; i++){
            for (int j = 0; j < unsortedZahlen.length-1; j++){
                if(unsortedZahlen[j] > unsortedZahlen[j+1]){
                    int cache = unsortedZahlen[j];
                    unsortedZahlen[j] = unsortedZahlen[j+1];
                    unsortedZahlen[j+1] = cache;
                }
            }
        }
        return unsortedZahlen;

    }


    public static int binarySearch(int[] zahlen, int wanted) {
        int l = 0;
        int r = zahlen.length;

        while(l <= r) {
            int m = (r/2)+(l/2);
            if(zahlen[m] == wanted){
                return m;
            }
            else if(zahlen[m] <= wanted){
                l = m;
            }
            else if (zahlen[m] >= wanted){
                r = m;
            }
        }
        return -1;
    }


}