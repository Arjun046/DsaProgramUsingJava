import java.util.Arrays;

// Java program for above approach
public class Rearrange{

    // Function to transform the array
//    public static void fixArray(int ar[], int n)
//    {
//        int i, j, temp;
//
//        // Iterate over the array
//        for(i = 0; i < n; i++)
//        {
//            for(j = 0; j < n; j++)
//            {
//
//                // Check is any ar[j]
//                // exists such that
//                // ar[j] is equal to i
//                if (ar[j] == i)
//                {
//                    temp = ar[j];
//                    ar[j] = ar[i];
//                    ar[i] = temp;
//                    break;
//                }
//            }
//        }
//
//        // Iterate over array
//        for(i = 0; i < n; i++)
//        {
//
//            // If not present
//            if (ar[i] != i)
//            {
//                ar[i] = -1;
//            }
//        }
//
//        // Print the output
//        System.out.println("Array after Rearranging");
//        for(i = 0; i < n; i++)
//        {
//            System.out.print(ar[i] + " ");
//        }
//    }

    // Driver Code
    public static void main(String[] args)
    {
        int n, ar[] = { -1, -1, 6, 1, 9,
                3, 2, -1, 4, -1 };
        n = ar.length;
        for (int i=0;i<n;i++){
            if(ar[i]>=0 && ar[i]!=i){
                int ele=ar[ar[i]];
                ar[ar[i]]=ar[i];
                ar[i]=ele;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(ar));
        // Function Call
//        fixArray(ar, n);
    }
}

// This code is contributed by divyesh072019
