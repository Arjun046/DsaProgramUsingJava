package Java.string;

public class StringLength {
//    static int Reclength(String str){
//        if(str.equals("")){
//            return 0;
//        }else{
//            return Reclength(str.substring(1))+1;
//        }
//    }
    public static void main(String[] args) {
        int i=0;
        String str="Prepinsta";
        char ch[]=str.toCharArray();
        for (char c:ch){
            i++;
        }
//        System.out.println("The length of string are" + Reclength(str));
        System.out.println("length of the string is" + i);

    }
}
