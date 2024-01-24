public class buyukSayi {
    public static void enBuyukSayi() {
// Soru 4: Java'da bir dizi içindeki en büyük sayıyı bulan bir fonksiyon yazınız.
        int[] sayi = {3, 4, 2, 1, 23, 5, 56, 2, 4, 32, 6, 6};
        int buyuk = sayi[0];
        for (int a = 0; a < sayi.length; a++) {
            if (sayi[a] > buyuk) {
                buyuk=sayi[a];

            }
        }
        System.out.println("EN BÜYÜK SAYI => " + buyuk);
    }
    public static void main( String[] args ) {
        enBuyukSayi();
    }
}
