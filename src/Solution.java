class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) return 0;

        // Initialize the second pointer
        int k = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the element at k-1 position
            if (nums[i] != nums[k - 1]) {
                // Place the current element at the k-th position
                nums[k] = nums[i];
                // Move the second pointer forward
                k++;
            }
        }

        // Return the count of unique elements
        return k;
    }
}