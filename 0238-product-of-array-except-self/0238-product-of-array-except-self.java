class Solution {
    public int[] productExceptSelf(int[] nums) {
       int temp=1;
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=temp;
            temp=temp*nums[i];
        }
        temp = 1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*temp;
            temp=temp*nums[i];
        }
        return result;
    }
}



// Another approach using postfix and prefix sum

// int left[] = new int[nums.length];
//         left[0]=1;
//         for(int i=1;i<nums.length;i++){
//             left[i]=left[i-1]*nums[i-1];
//         }
//         int right[] = new int[nums.length];
//         right[nums.length-1] = 1;
//         for(int i=nums.length-2;i>=0;i--){
//             right[i] = right[i+1]*nums[i+1];
//         }
//         for(int i=0;i<nums.length;i++){
//             left[i]=left[i]*right[i];
//         }
//         return left;