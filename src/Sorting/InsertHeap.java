package Sorting;

public class InsertHeap {
    static void insetHeap(int a[],int n,int i){
        int parent=(i/2);
        if(a[parent]>0){
            if(a[i]>a[parent]){
                    int temp=a[i];
                    a[i]=a[parent];
                    a[parent]=temp;

                    insetHeap(a,n,parent);
            }
        }
    }
    static int insertnode(int a[],int n,int key){
        n=n+1;
        a[n-1]=key;
        insetHeap(a,n,n-1);
        return n;

    }
    static void printArray(int a[],int n){
        for (int i=0;i<n;i++){
            System.out.println(a[i]);

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int MAX = 1000;
        int a[] = new int[MAX];

        // initializing some values
        a[0] = 10;
        a[1] = 5;
        a[2] = 3;
        a[3] = 2;
        a[4] = 4;
        int n=5;
        int key=15;
        n=insertnode(a,n,key);
        printArray(a,n);


    }
}
