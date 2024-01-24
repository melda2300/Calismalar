public class Faktoriyel {
    public static void faktoriyel( int a ) {
        int faktoriyel = 1;
        for (int b = 1; b <= a; b++) {
            faktoriyel *= b;
        }
        System.out.println(a + " sayısının faktoriyeli = " + faktoriyel);
    }

    public static void main( String[] args ) {
        faktoriyel(4);
    }
}
