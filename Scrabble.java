public class Scrabble {

public static void main(String[] args) {
	String a = "jesus";
	String b = "jesusses";
	if (canSpell(a, b)) {
		System.out.println("Scrabableeee!!");
} else {
	System.out.println("Shucks");
}
}

public static boolean canSpell(String rack, String word) {
    for (int i = 0; i < word.length(); i++) {
        char letter = word.charAt(i);
        if (letterCount(rack, letter) < letterCount(word,letter))
            return false;
    }
    return true;
}
 
public static int letterCount(String s, char c) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        char letter = s.charAt(i);
        if (letter == c) sum++;
    }
    return sum;
}
}
