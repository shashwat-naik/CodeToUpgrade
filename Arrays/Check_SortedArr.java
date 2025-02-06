
public class Check_SortedArr {
    public static boolean sortingcheck(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1])
                return false;
                }
        return true;
        }

        public static void main(String[] args) {
            int[] arr = { 3, 6, 8, 10 };
            System.out.println(sortingcheck(arr, arr.length));
    }
}



// Modified question for finding out the sequence of the array if its sorted, else returns unsorted as the answer
/* 
public class Check_SortedArr {
    public static String check(int[] arr, int n) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                ascending = false;
            else if (arr[i] > arr[i - 1])
                descending = false;
        }
        if (ascending)
            return "Ascending order";
        else if (descending)
            return "Descending order";

        return "Unsorted";
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 3, 1, 8 };
        System.out.println(check(arr, arr.length));
    }
}
 */