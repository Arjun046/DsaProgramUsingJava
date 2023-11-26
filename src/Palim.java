public class Palim {
    static boolean palim(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return palim(s, l + 1, r - 1);
    }

    public static boolean palim(String s) {
        return palim(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        String s = "aba";
        s = s.toLowerCase();
        boolean isPalindrome = palim(s);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}
