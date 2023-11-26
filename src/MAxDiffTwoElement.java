public class MAxDiffTwoElement {
    public static void main(String[] args) {
        int arr[]={7,9,5,6,14,2};
        int maxdiff=arr[1]-arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if((arr[i]-min)>maxdiff){
                maxdiff=arr[i]-min;
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
            System.out.println(maxdiff+" ");
        }
    }
