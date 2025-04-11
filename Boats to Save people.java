class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Sort the array to easily pair the lightest and heaviest person
        Arrays.sort(people);

        // Initialize two pointers: one at the start and one at the end of the array
        int left = 0;
        int right = people.length - 1;

        // Variable to count the number of boats used
        int boats = 0;

        // Loop until all people have been assigned to boats
        while (left <= right) {
            // If the lightest person and the heaviest person can share a boat
            if (people[right] + people[left] <= limit) {
                // Move the left pointer to the next person
                left++;
            }

            // Move the right pointer to the next heaviest person (one person is always taken)
            right--;

            // Increment the number of boats used
            boats++;
        }

        // Return the total number of boats needed
        return boats;
    }
}
