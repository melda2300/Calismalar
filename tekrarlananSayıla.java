public class TekrarEdenSayilar {
    public static void tekrarlananSayilariBul( int[] dizi ) {
        System.out.println("Tekrarlanan sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.println(dizi[i]);
                    break;
                }
            }
        }
    }

    public static void main( String[] args ) {
        int[] sayi = {2, 34, 6, 2, 8, 6, 7, 2, 3, 6, 7, 8};
        tekrarlananSayilariBul(sayi);
    }
}
