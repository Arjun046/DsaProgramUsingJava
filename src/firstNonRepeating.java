import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
    static int firstnonrepeating(int a[],int n){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else
                map.put(a[i],1);
        }
        for (int i=0;i<n;i++){
            if (map.get(a[i])==1){
                return a[i];
            }

        }
        return -1;

    }
    public static void main(String[] args) {
int a[]={9,4,9,6,7,4};
int n=a.length;
        System.out.println(firstnonrepeating(a,n));
    }
}
