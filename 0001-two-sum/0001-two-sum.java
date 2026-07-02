class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }
}

/*
________________
USING ARRAYLIST
________________

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] + arr[j] == target){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }

        return result;
    }
}
*/