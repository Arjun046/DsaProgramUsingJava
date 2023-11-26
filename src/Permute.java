public class Permute {
    static void swap(char[] s, int l, int r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }

    static void permute(char[] s, int l, int r) {
        if (l == r) {
            System.out.println(new String(s));
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(s, l, i);
            permute(s, l + 1, r);
            swap(s, l, i); // Backtrack to restore the original order
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        permute(charArray, 0, charArray.length - 1);
    }
}
