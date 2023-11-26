package Sorting;

public class DeleteHeap {
    static void deleteheap(int a[], int n, int i){
        int laregst=i;
        int left=2*i;
        int right=2*i+1;
        if(left<n && a[left]>a[laregst]){
            laregst=left;
        }
        if(right<n && a[right]>a[laregst]){
            laregst=right;
        }
        if(laregst!=i){
            int swap=a[i];
            a[i]=a[laregst];
            a[laregst]=swap;

            deleteheap(a,n,laregst);
        }
    }
    static int deleteroot(int a[],int n){
        int lastelement=a[n-1];
        a[0]=lastelement;

        n=n-1;
        deleteheap(a,n,0);
        return n;
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={10,5,3,2,4};
        int n= a.length;
        n=deleteroot(a,n);
        printArray(a,n);


    }
}
