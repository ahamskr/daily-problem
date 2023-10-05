// 229. Majority Element II

class Solution05 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int no=nums.length/3;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        } 
        for(int key:map.keySet()){
            if(no<map.get(key)) ans.add(key);
        }
        return ans;
    }
}