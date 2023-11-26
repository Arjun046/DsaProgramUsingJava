public class WaveForm {
    public static void main(String[] args) {
        int a[]={10, 90, 49, 2, 1, 5, 23};
        int n=a.length;
        for (int i=0;i<n;i+=2){
            if(i>0 && a[i-1]>a[i]){
                swap(a,i,i-1);
            }
            if(i<n-1 && a[i]<a[i+1]){
                swap(a,i,i+1);
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }


        }
    static void swap(int a[],int b,int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }

}
