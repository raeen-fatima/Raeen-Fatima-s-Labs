package Strings;
public class CountVowels {
    public static void main(String[] args) {
        String str = "Fatima is learning Java";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Vowel count: " + count);
    }
}
