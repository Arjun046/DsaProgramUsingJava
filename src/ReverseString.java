public class ReverseString {
    public static void main(String[]args) {
        String s = "Big Dream";
        String reversestr = "";
        for (int i = s.length()-1;i>=0;i--){
            reversestr=reversestr+s.charAt(i);

        }
        System.out.println("original string" +s);
        System.out.println("Reversed string" +reversestr);
    }
}
