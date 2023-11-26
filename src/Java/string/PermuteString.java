package Java.string;

public class PermuteString {
//     static String  swap(String str,int l,int r){
//        char[] charArray=str.toCharArray();
//        char temp=charArray[l];
//        charArray[l]=charArray[r];
//        charArray[r]=temp;
//        return String.valueOf(charArray);
//
//    }
//    static void permute(String str,int l,int r){
//        if(l==r){
//            System.out.println(str);
//            return;
//        }
//        for (int i=l;i<=r;i++){
//            str=swap(str,l,i);
//            permute(str,l+1,r);
//            str=swap(str,l,i);
//        }
//    }

    static void printpermute(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            String r=str.substring(0,i)+str.substring(i+1);
            printpermute(r,ans+ch);
        }
    }
    public static void main(String[] args) {
//      int l=0;
      String str="abc";
//        int r=str.length()-1;
//        permute(str,l,r);
        printpermute(str,"");
    }
}
