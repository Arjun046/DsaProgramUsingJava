import java.util.HashMap;

public class Subarraysum {
    public static void subarraySum(int[] a, int sum,int n){
        int currsum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<n;i++){
            currsum+=a[i];
            if(currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(hashMap.containsKey(currsum-sum)){
                start=hashMap.get(currsum-sum)+1;
                end=i;
                break;
            }
            hashMap.put(currsum,i);
        }
        if(end==-1){
            System.out.println("not found");
        }else {
            System.out.println(start+" "+end);
        }

    }
    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        int n= a.length;
        int sum=5;
       subarraySum(a,sum,n);

    }
}
