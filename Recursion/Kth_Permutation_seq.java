import java.util.ArrayList;

public class Kth_Permutation_seq {
    public static String Permutation(int n, int k) {
        int factorial = 1;
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            factorial *= i;
            num.add(i);
        }
        num.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + num.get(k / factorial);
            num.remove(k / factorial);
            if (num.size() == 0)
                break;

            k = k % factorial;
            factorial = factorial / num.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        String ans = Permutation(n, k);
        System.out.println("The K-th permutation sequesnce is " + ans);
    }
}
