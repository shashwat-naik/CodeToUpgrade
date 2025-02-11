import java.util.*;

public class Combination_Sum {
    public static void findCombi(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombi(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }

        findCombi(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> CombinationSum(int[] candidate, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombi(0, candidate, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        Combination_Sum sol = new Combination_Sum();
        List<List<Integer>> ans = sol.CombinationSum(arr, target);

        System.out.println("Combinations are: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
