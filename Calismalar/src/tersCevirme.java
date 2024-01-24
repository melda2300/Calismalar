public class tersCevirme {
    public static void tersCevirme(){
 // Soru 10: Java'da bir dizide tekrarlanan sayıları bulan bir program yazınız.
        int[] sayi = {3, 4, 2, 1, 23, 5, 56, 2, 4, 32, 6, 6};

        int[] ters = new int[sayi.length];

        for (int a = 0; a < sayi.length; a++) {
            ters[sayi.length - 1 - a] = sayi[a];
        }

        for (int terss : ters) {
            System.out.print(terss + ",");
        }
    }
    public static void main( String[] args ) {
        tersCevirme();
    }
}

