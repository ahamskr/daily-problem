// Maximum Sum Combination

class PairQueue implements Comparable<PairQueue>{
    int sum;
    int i;
    int j;
    public PairQueue(int sum, int i, int j) {
        this.sum = sum;
        this.i = i;
        this.j = j;
    }
    @Override
    public int compareTo(PairQueue o)
    {
        if(o.sum>this.sum){
            return 1;
        }else if(o.sum<this.sum){
            return -1;
        }else{
            return 0;
        }
    }
}


class Solution {
    static List<Integer> maxCombinations(int n, int k, int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<PairQueue> pq = new PriorityQueue<>();
        HashSet<String> set = new HashSet<>();

        int l = n-1;//for a index.
        int m = n-1;//for b index.

        pq.add(new PairQueue(a[l]+b[m],l,m));
        set.add(l+" "+m);

        for(int i=0;i<k;i++){
            PairQueue valQ = pq.poll();
            ans.add(valQ.sum);

            //for a[i-1]+b[i]
            l = valQ.i-1;
            m = valQ.j;
            if(l>=0 && m>=0 && !set.contains(l+" "+m)){
                pq.add(new PairQueue(a[l]+b[m],l,m));
                set.add(l+" "+m);
            }

            //for a[i]+b[i-1]
            l = valQ.i;
            m = valQ.j-1;
            if(l>=0 && m>=0 && !set.contains(l+" "+m)){
                pq.add(new PairQueue(a[l]+b[m],l,m));
                set.add(l+" "+m);
            }
        }

        return ans;

    }
}