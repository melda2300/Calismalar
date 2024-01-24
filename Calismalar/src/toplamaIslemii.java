import java.util.Scanner;
public class toplamaIslemii {
    public static void toplamaIslemi() {
        // Soru 3: İki tamsayıyı toplayan bir Java programı yazınız. (Kullanıcıdan giriş alabilirsiniz.)
        Scanner scr = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = scr.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int b = scr.nextInt();

        int c = a + b;
        System.out.println("toplamları: " + c);

        scr.close();
    }
    public static void main( String[] args ) {
        toplamaIslemi();
    }
}
