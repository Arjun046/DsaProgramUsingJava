public class MoveAllnegativetoend {
    public static void main(String[] args) {
        int a[] = {1, 3, -4, 5, -1, -2, 6, 8};
        int n = a.length;
        moveallend(a,n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static void moveallend(int a[], int n) {
int temp[]=new int[n];
        int j = 0;

        for (int i = 0; i < n; i++)
            if (a[i] >= 0)
                temp[j++] = a[i];


        if (j == n || j == 0)
            return;


        for (int i = 0; i < n; i++)
            if (a[i] < 0)
                temp[j++] = a[i];


        for (int i = 0; i < n; i++)
            a[i] = temp[i];
    }
    }