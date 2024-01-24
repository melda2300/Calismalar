public class TersString {
    public static void tersStr() {

        String merhaba = "AmA";
        String tersi = "";
        for (int a = merhaba.length() - 1; a >= 0; a--) {

            tersi += merhaba.charAt(a);
        }
        System.out.println(tersi);
    }

    public static void main( String[] args ) {
        tersStr();
    }
}
