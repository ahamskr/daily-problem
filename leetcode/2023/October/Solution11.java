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

    /*  Second Solution with BinarySearch
        
        public int[] fullBloomFlowers(int[][] flowers, int[] people) {
            int n=flowers.length,m=people.length;
            int[] start=new int[n],end=new int[n];
            for(int i=0;i<n;i++){
                start[i]=flowers[i][0];
                end[i]=flowers[i][1];
            }
            Arrays.sort(start);
            Arrays.sort(end);
            int[] ans=new int[m];
            for(int i=0;i<m;i++){
                int totalStartedBefore=bs(start,people[i]+1,n);
                int totalEndedBefore=bs(end,people[i],n);
                ans[i]=totalStartedBefore-totalEndedBefore;
            }
            return ans;
        }
        int bs(int[] arr,int target,int n){
            int lo=0,hi=n-1,ans=n;
            while(lo<=hi){
                int mi=lo+hi>>1;
                if(arr[mi]>=target){
                    ans=mi;
                    hi=mi-1;
                }
                else lo=mi+1;
            }
            return ans;
        }

    */

    /*  Third Solution with Sweep Line Algorithm
        
        // Sweep Line Algorithm
        public int[] fullBloomFlowers(int[][] flowers, int[] people) {
            Queue<int[]> pq=new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
            for(int[] arr:flowers){
                pq.offer(new int[]{arr[0],0});
                pq.offer(new int[]{arr[1],2});
            }
            int n=people.length,bloomed=0;
            for(int i=0;i<n;i++){
                pq.offer(new int[]{people[i],1,i});
            }
            int[] ans=new int[n];
            while(!pq.isEmpty()){
                int[] arr=pq.poll();
                if(arr[1]==0) bloomed++;
                else if(arr[1]==2) bloomed--;
                else{
                    ans[arr[2]]=bloomed;
                }
            }
            return ans;
        }

    */
}