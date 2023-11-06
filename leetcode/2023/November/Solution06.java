// 1845. Seat Reservation Manager

class Solution06{
// class SeatManager {
    TreeSet<Integer> set;
    public SeatManager(int n) {
        set=new TreeSet<>();
        for(int i=1;i<=n;i++) set.add(i);
    }
    
    public int reserve() {
        return set.pollFirst();
    }
    
    public void unreserve(int seatNumber) {
        set.add(seatNumber);
    }
}