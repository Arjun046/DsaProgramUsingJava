public class SearchSortedAndRotated {
    public static int search(int arr[],int l,int r,int key){
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key)
            return mid;

        if(arr[l]<=arr[mid]){
            if (key>=arr[l] && key<=arr[mid])
                return search(arr, l, mid-1, key);

            return search(arr,mid+1,r,key);
        }
        if (key>=arr[mid] && key<=arr[r])
            return search(arr,mid+1,r,key);

        return search(arr,l,mid-1,key);
    }
    public static void main(String[] args) {
    int arr[]={4, 5, 6, 7, 8, 9, 1, 2, 3 };
    int n=arr.length;
    int key=1;
    int i=search(arr,0,n-1,key);
    if(i!=-1){
        System.out.println("index"+i);

    }else {
        System.out.println("key not found");
    }
    }
}
