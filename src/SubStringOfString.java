import java.util.Scanner;

public class SubStringOfString {
    public static void main(String[]args){
        String string,sub;
        int i,c,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of all substring");
        string=sc.nextLine();
        length=string.length();
        System.out.println("substrings of \""+string+"\" are :-");
        for (c=0;c<length;c++){
            for (i=1;i<=length-c;i++){
                sub=string.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}
