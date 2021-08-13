class Solution {
    public int[] visit;
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        visit = new int[nums.length];
        
        recursive(ans, nums, new ArrayList<>());
        
        return ans;
    }
    
    public void recursive(List<List<Integer>> ans, int[] nums, List<Integer> list)
    {
        
        if (list.size() == nums.length) {
            System.out.println(list);
            ans.add(new ArrayList<>(list)); // [2]
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visit[i] == 1) {
                continue;
            }

            list.add(nums[i]);
            visit[i] = 1;
            
            recursive(ans, nums, list);
            visit[i] = 0;
            
            list.remove(list.size() - 1);
        }
    }
}

