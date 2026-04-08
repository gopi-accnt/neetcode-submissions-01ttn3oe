class Solution {
    //Uses extra vairable, and will fail if the duplicate numbers are not adjacant
    /*public boolean hasDuplicate(int[] nums) {
        int dupFound = 0;
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                ++dupFound;
            }
        }
        return dupFound > 0;
    }*/

    //Doesn't use extra variable, but fails if the duplicate is not adjacant
    /*public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }*/

    //Works even if the duplicates are adjacant, as I use sorting
    /*public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }*/

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}