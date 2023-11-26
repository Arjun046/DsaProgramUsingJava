public class Largest3 {
    public static void printLargest(int arr[],int size){
        int i,first,second,three;
        if(size<3){
            System.out.print("Invalid Input");
        }
        three=first=second=Integer.MIN_VALUE;
        for(i=0;i<size;i++){
            if(arr[i]>first){
                three=second;
                second=first;
                first=arr[i];
            }else if(arr[i]>second){
                second=first;
                first=arr[i];
            } else if (arr[i]>three) {
                three=arr[i];
            }
        }
        System.out.println("three element are:"+first+" "+second+" "+three);
    }
    public static void main(String[] args) {
        int arr[]={12,13, 1, 10, 34, 1};
        int n= arr.length;
        printLargest(arr,n);

    }
}
