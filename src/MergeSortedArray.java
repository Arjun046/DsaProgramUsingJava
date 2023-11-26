public class MergeSortedArray {
    public static void mergeArrays(int[] arr1, int[] arr2, int m,
                                   int n,int[] arr3) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0&&j>=0)
        {
            if(arr1[i]>arr2[j])
            {
                arr3[k]=arr1[i];
                i--;
                k--;
            }
            else
            {
                arr3[k]=arr2[j];
                j--;
                k--;
            }
        }
        while(i>=0)
            arr3[k--]=arr1[i--];
        while(j>=0)
            arr3[k--]=arr2[j--];
    }


    public static void main (String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int n = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int m = arr2.length;

        int[] arr3 = new int[m+n];

        mergeArrays(arr1, arr2, m, n, arr3);

                System.out.println("Array after merging");
        for (int i=0; i < m+n; i++)
            System.out.print(arr3[i] + " ");
    }
}
