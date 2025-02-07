
public class Left_rotate_K_times {
    public static void RotateLeft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;

        RotateLeft(arr, arr.length, k);
        System.out.println("Array after rotation");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
