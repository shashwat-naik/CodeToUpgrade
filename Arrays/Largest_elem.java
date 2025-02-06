class Largest_elem {
    public static int largestNum(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 9, 11, 3 };
        System.out.println("Largest element : " + largestNum(arr, arr.length));
    }
}