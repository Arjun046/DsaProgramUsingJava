package Java.string;

public class PalindromString {

    static boolean Palim(String str,int l,int r){
        if(l>=r){
            return true;
        }if(str.charAt(l)!=str.charAt(r)){
            return  false;

        }else {
            return Palim(str,l+1,r-1);
        }
    }
    public static void main(String[] args) {

        String str="abcba";
        int l=0;
        int r=str.length()-1;
        System.out.println(Palim(str,l,r));
    }
}
