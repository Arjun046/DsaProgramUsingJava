package Sorting;

public class Rearrangemaxandmin {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
//        int max_idx=a[n-1];
//        int min_idx=a[0];
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                a[i]=max_idx;
//                max_idx-=1;
//            }else {
//                a[i]=min_idx;
//                min_idx+=1;
//            }
//        }
//        for (int i=0;i<n;i++) {
//            System.out.print(a[i]+" ");
//        }
//    }
//}

//another approach
        int max_ele = n - 1;
        int min_ele = 0;
        int max_elem = a[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i] += (a[max_ele] % max_elem) * max_elem;
                max_ele--;
            } else {
                a[i] += (a[min_ele] % max_elem) * max_elem;
                min_ele++;
            }
        }
        for (int i = 0; i < n; i++) {
            a[i] = a[i] / max_elem;
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }

}
