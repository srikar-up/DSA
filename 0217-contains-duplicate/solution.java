class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for (int num : nums) {
            s1.add(num);
        }
        return s1.size() != nums.length;
    }
}

