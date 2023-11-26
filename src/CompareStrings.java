import java.util.Scanner;

public class CompareStrings {
    public static void main(String[]args){
        String s1,s2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first String");
        s1=sc.nextLine();
        System.out.println("Enter second string");
        s2=sc.nextLine();
        if(s1.compareTo(s2)>0){
            System.out.println("first string is greater than second");
        }else if (s1.compareTo(s2)<0){
            System.out.println("first string is lesser than second");
        }else {
            System.out.println("both string are equal");
        }
    }
}
