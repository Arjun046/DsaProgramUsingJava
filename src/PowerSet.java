public class PowerSet {
    static void power(String s,int i,String curr){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        power(s,i+1,curr+s.charAt(i));
        power(s,i+1,curr);
    }
    public static void main(String[] args) {
        String s="abc";
        int i=0;
        String curr="";
        power(s,i,curr);

    }
}
