public class CommonSortedArrays {
    public static void main(String[] args) {
        int a1[]={1,5,10,20,40,80};
        int a2[]={6,7,20,80,100};
        int a3[]={3,4,15,20,30,70,80,120};
        int x=0,y=0,z=0;
        while (x<a1.length && y<a2.length && z<a3.length){
            if(a1[x]==a2[y] && a2[y]==a3[z]){
                System.out.println(a1[x]);
                x++;
                y++;
                z++;
            } else if (a1[x]>a2[y]) {
                y++;

            } else if (a2[y]>a3[z]) {
                z++;

            }else {
                x++;
            }
        }
    }
}
