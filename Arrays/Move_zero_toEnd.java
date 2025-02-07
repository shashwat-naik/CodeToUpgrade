public class Move_zero_toEnd {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void zero(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != j)
                    swap(arr, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5, 0 };
        zero(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
