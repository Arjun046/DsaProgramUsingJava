public class Segeregateevenandodd {
    public static void main(String[] args) {
        int a[]={1,9,5,3,2,6,7,11};
        int n= a.length;
        int i=-1,j=0;
        while(j!=n){
            if(a[j]%2==0){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            j++;
        }
        for ( i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
