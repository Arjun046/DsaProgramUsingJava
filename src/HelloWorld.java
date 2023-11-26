public class HelloWorld {
    static void printUnique(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 3, 5, 8, 2, 6, 7 };
        int n = arr.length;
        printUnique(arr, n);
    }
}
