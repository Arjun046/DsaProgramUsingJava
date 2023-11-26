import java.util.Stack;

public class  SmallerLeftElement {
    static void smallerleftElement(int arr[],int n){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i< n;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }if(s.isEmpty()){
                System.out.println("-1");
            }else {
                System.out.println(s.peek());
            }
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int a[]={4,10,5,8,20,15,3,12};
        int n= a.length;
        smallerleftElement(a,n);
    }
}
