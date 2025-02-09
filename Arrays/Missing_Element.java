public class Missing_Element {
    public static int FindNum(int[] arr, int N) {
        int sum = (N * (N + 1)) / 2;

        int store = 0;
        for (int num : arr) {
            store += num;
        }

        return sum - store;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        int N = 10;
        System.out.println("Missing number is: " + FindNum(arr, N));
    }
}
