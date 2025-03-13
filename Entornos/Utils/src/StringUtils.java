public class StringUtils {

    public static boolean esPalindrom(String paraula) {
        if (paraula == null) {
            return false;
        }
        String neta = paraula.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(neta).reverse().toString().equals(neta);
    }

    public static int comptarVocals(String text) {
        if (text == null) {
            return 0;
        }
        return (int) text.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
