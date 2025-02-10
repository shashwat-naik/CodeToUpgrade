import java.util.ArrayList;

public class Subset_Sum {
    public static void solve(int i, int sum, ArrayList<Integer> list, int[] arr) {
        if (i == arr.length) {
            list.add(sum);
            return;
        }
        solve(i + 1, sum + arr[i], list, arr);
        solve(i + 1, sum, list, arr);

        return;
    }

    public static ArrayList<Integer> subsetSum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        solve(0, sum, list, arr);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> result = subsetSum(arr);
        System.out.println(result);
    }
}
