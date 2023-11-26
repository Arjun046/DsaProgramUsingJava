package Java.string;

public class Testimmutable {
    public static void main(String[] args) {
        String s="Sachin";
       // s.concat("Tendulkar");
        s=s.concat("Tendulkar") ;
        System.out.println(s);//will print sachine because String are immutable objects
    }
}
