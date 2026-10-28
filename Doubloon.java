public class Doubloon {

    public static void main (String[] args) {
        String s = "Aba"; 
        System.out.println("Is " + s + " a Doubloon? " + isDoubloon(s));
    }

    public static boolean isDoubloon (String s) {
        String lowerS = s.toLowerCase();
        
        for (int i = 0; i < lowerS.length(); i++) {
            char letter = lowerS.charAt(i);
            if (letterCount(lowerS, letter) != 2) {
                return false;
            }
        }
        return true;
    }
    public static int letterCount(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == c) {
                sum++;
            }
        }
        return sum;
    }
}
