
import java.util.HashSet;

public class remove_duplicate {
    public static int removeDuplicate(int[] arr, int n) {
        HashSet<Integer> store = new HashSet<>();
        for (int i = 0; i < n; i++) {
            store.add(arr[i]);
        }
        int j = 0;
        int k = store.size();

        for (int x : store) {
            arr[j++] = x;
            System.out.print(x + " ");
        }

        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int k = removeDuplicate(arr, arr.length);
        System.out.println("\nSize of the array is " + k);

    }
}
