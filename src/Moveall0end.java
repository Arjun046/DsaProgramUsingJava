public class Moveall0end {
    public static void moveallZero(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while (count<n){
            arr[count++]=0;
        }
    }
    public static void main(String[] args) {
int arr[]={1,4,5,0,0,3,0,6,0};
         int n= arr.length;
         moveallZero(arr,n);
        System.out.println("Array after move zero");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
