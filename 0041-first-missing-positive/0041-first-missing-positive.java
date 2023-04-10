class Solution {
public int firstMissingPositive(int[] nums) {
    int n = nums.length;

    // First pass: place each number in its correct position
    for (int i = 0; i < n; i++) {
        while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
            int j = nums[i] - 1;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    // Second pass: find the index of the first element that is not in its correct position
    for (int i = 0; i < n; i++) {
        if (nums[i] != i+1) {
            return i+1;
        }
    }

    // If all elements are in their correct positions, the smallest missing positive integer is n+1
    return n+1;
}

}



