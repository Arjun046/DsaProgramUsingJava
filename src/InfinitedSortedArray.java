public class InfinitedSortedArray {
    static int searchInfinite(int[] a, int key){
        int low=0;
        int high=1;
        while(a[high]<key){
            low=high;
            high=2*high;
        }
        return binarySearch(a,key,low,high);
    }
    static int binarySearch(int[] a, int key,
                            int low, int high)
    {
        while (low <= high) {
            // find the middle element
            //            int mid = (start + end) / 2; //
            //            might be possible that (start +
            //            end) exceeds the range of int in
            //            java
            int mid = low + (high - low) / 2;

            if (key < a[mid]) {
                high = mid - 1;
            }
            else if (key > a[mid]) {
                low = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 3,   5,   7,   9,   10, 90,
                100, 130, 140, 160, 170 };
        int target = 90;
        // Function call
        int ans = searchInfinite(arr, target);
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "
                    + ans);
    }
}

