public class SegregateEvenodd1 {
    public static void main(String[] args) {
        int a[] = {12, 34, 45, 9, 8, 90, 3};
        int n = a.length;

//        int left=0,right=a.length-1;
//        while (left<right){
//            while (a[left]%2==0 && left<right){
//                left++;
//            }
//            while (a[right]%2==1 && left<right){
//                right--;
//            }
//            if (left<right){
//                int temp=a[left];
//                a[left]=a[right];
//                a[right]=a[left];
//                left++;
//                right--;
//            }
//        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "");
        }
//    }
//}

//another approach

//        int j = -1, temp;
//
//// quick sort method
//        for (int i = 0; i < n; i++) {
//
//            // if array of element
//            // is odd then swap
//            if (a[i] % 2 == 0) {
//
//                // increment j by one
//                j++;
//
//                // swap the element
//                temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//    }
//}
//another approach
        int i = 0, j = (n - 1);


        while (j >= i) {

            if (a[i] % 2 != 0) {
                if (a[j] % 2 == 0) {


                    a = swap(a, i, j);
                    i++;
                    j--;
                } else
                    j--;
            } else
                i++;
        }

        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}

