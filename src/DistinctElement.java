import java.util.Arrays;

public class DistinctElement {
    static int distinct(int arr[],int n) {
//        int res = 1;
//        for (int i = 1; i < n; i++) {
//            int j = 0;
//            for (j = 0; j < i; j++)
//                if (arr[i] == arr[j])
//                    break;
//
//                if (i == j)
//                    res++;
//
//        }
//        return res;
//    }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            res++;
        }
        return res;
    }
        public static void main (String[]args){
            int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
            int n=arr.length;
            System.out.println(distinct(arr,n));

        }
    }
