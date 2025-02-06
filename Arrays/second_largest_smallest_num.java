public class second_largest_smallest_num {
    public static int secSmallest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secSmall = small;
                small = arr[i];
            } else if (arr[i] < secSmall && arr[i] != small) {
                secSmall = arr[i];
            }
        }
        return secSmall;
    }

    public static int secLargest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secLarge = large;
                large = arr[i];
            } else if (arr[i] > secLarge && arr[i] != large) {
                secLarge = arr[i];
            }
        }
        return secLarge;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        System.out.println("Second Smallest element: " + secSmallest(arr, arr.length));
        System.out.println("Second Largest element: " + secLargest(arr, arr.length));
    }
}
