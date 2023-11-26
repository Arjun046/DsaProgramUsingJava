public class MinimumElement {
    //minimum element in sorted & rotated array
    public static int findmin(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;

        //array are sorted
        if (arr[0] < arr[end]) {
            return arr[0];
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (start < mid && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (end > mid && arr[mid + 1] < arr[mid]) {
                return arr[mid + 1];
            } else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={11,2,3,4,5,6,7,8};
        int result=findmin(arr);
        System.out.println(result);

    }
}
