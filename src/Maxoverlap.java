import java.util.Arrays;

public class Maxoverlap {
    static  int findPlatform(int a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int ans=0;
        int i=0,j=0;
        while (i<n){
            if(a[i]<=b[j]){
                count++;
                ans=Math.max(count,ans);
                i++;
            }else if(a[i]>b[j]){
                count--;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={900,940,950,1100,1500,1800};
        int b[]={910,1200,1120,1130,1900,2000};
        int n=a.length;
        System.out.println(findPlatform(a,b,n));

    }
}
