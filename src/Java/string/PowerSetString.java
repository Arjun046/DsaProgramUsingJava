package Java.string;

public class PowerSetString {
    //abc={abc,a,b,c,ab,bc," "}
    static void Power(String str,int i,String curr){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }else {
            Power(str,i+1,curr+str.charAt(i));
            Power(str,i+1,curr);
        }

        }

    public static void main(String[] args) {
        String str="abc";

        Power(str,0,"");

    }
}
