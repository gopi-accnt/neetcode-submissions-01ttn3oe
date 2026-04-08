class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            hashSet.add(n);
        }
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(start)) {
                return start;
            } else {
                start++;
            }
        }
        return start;
    }
}
