class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums != null && nums.length > 0)
            permute(nums,0,result);
        
        return result;
    }
    
    private void permute(int[] nums, int k, List<List<Integer>> result){
        if(k == nums.length){
            List<Integer> ll = new ArrayList<>();
            for(int i: nums)
                ll.add(i);
            
            result.add(ll);
            return;
        }
        
        for(int i=k; i < nums.length; i++){
            swap(nums,i,k);
            permute(nums,k+1,result);
            swap(nums,i,k);
        }
                
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}