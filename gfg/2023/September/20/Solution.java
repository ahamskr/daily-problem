class Solution
{
    ArrayList<Integer> rotate(int N, int D)
    {
        D%=16;
        // 0xFFFF => 1111 1111 1111 1111
        // & is done to convert it into 16 bit number
        int left=((N<<D)|(N>>(16-D)))&0xFFFF;
        int right=((N>>D)|(N<<(16-D)))&0xFFFF;
        return new ArrayList<>(Arrays.asList(left,right));
    }
}