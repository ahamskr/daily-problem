// 2251. Number of Flowers in Full bloom 

class Solution11 {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer,Integer> freq=new TreeMap<>();
        for(int[] arr:flowers){
            freq.put(arr[0],freq.getOrDefault(arr[0],0)+1);
            freq.put(arr[1]+1,freq.getOrDefault(arr[1]+1,0)-1);
        }
        int cur=0,n=people.length;
        for(int key:freq.keySet()){
            int num=freq.get(key);
            cur+=num;
            freq.put(key,cur);
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            Integer floorKey=freq.floorKey(people[i]);
            ans[i]=floorKey==null?0:freq.get(floorKey);
        }
        return ans;
    }
}