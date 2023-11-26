public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        int ans_index=0;
        int count=1;
        for(int i=0;i<size;i++){
            if(count==0){
                ans_index=a[i];
            }
            if(ans_index==a[i])
                count++;
            else
                count--;
        }

        count=0;
        for(int i=0;i<size;i++){
            if(ans_index==a[i]){
                count++;
            }
        }

        if(count>size/2){
            return ans_index;
        }
        return -1;
        // your code here
    }

    public static void main(String[] args) {
        MajorityElement majorityElement=new MajorityElement();
        int arr[]=new int[]{5,1,4,1,1};
        int size = arr.length;
        System.out.println(new MajorityElement().majorityElement(arr,size));

    }
}
