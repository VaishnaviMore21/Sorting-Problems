class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        int n = arr1.length;
        int m = arr2.length;

        // Step 1: Find the maximum value in arr1 to determine the size of the count array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr1[i]);
        }

        // Step 2: Create a counting array and count the frequency of each element in arr1
        int[] countArr = new int[max + 1];
        for (int i = 0; i < n; i++) {
            countArr[arr1[i]]++;
        }

        // Step 3: Create a result array to store the sorted output
        int[] res = new int[n];
        int index = 0;

        // Step 4: Place elements from arr1 into result array based on the order of arr2
        for (int i = 0; i < m; i++) {
            int element = arr2[i];
            while (countArr[element] > 0) {
                res[index++] = element;
                countArr[element]--;
            }
        }

        // Step 5: Append the remaining elements that were not in arr2, in ascending order
        for (int i = 0; i <= max; i++) {
            while (countArr[i] > 0) {
                res[index++] = i;
                countArr[i]--;
            }
        }

        // Step 6: Return the final sorted result
        return res;
    }
}
