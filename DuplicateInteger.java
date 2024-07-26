class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int number: nums){
            if(numSet.contains(number)) return true;
            else numSet.add(number);
        }
        return false;
    }
}
