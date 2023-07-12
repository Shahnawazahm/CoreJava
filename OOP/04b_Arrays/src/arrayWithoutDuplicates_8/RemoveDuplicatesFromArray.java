package arrayWithoutDuplicates_8;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        int n = arr.length;
        System.out.print("Original Array: ");
        for (int k:arr) {
            System.out.print(k + " ");
        }
        // loop through the array and compare each element with the rest of the elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // if a duplicate is found, shift the elements to the left to remove it
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // reduce the size of the array
                    j--; // adjust the loop counter
                }
            }
        }
        // print the array without duplicates
        System.out.print("\nArray without duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

