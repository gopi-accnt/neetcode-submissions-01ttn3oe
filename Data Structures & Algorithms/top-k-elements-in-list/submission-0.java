class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Creating the bucket object
        List<Integer>[] freq = new List[nums.length + 1];
        /*for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }*/

        //Counting the duplicate values
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        //Adding the values back to the bucket object based on COUNT as KEY (integer)
        //And adding given NUMBER as VALUE (list)
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            if (freq[val.getValue()] == null) {
                freq[val.getValue()] = new ArrayList<>();
            }
            freq[val.getValue()].add(val.getKey());
        }

        //Processing the values from backwards
        int[] res = new int[k];
        int ind = 0;
        for (int i = freq.length - 1; i >= 0 && ind < k; i--) {
            if (freq[i] != null) {
                for (int n : freq[i]) {
                    res[ind++] = n;
                    if (ind == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
