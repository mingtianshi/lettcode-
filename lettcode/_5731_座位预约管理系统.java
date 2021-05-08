//https://leetcode-cn.com/problems/seat-reservation-manager/
//5731. 座位预约管理系统
class SeatManager {

    public Queue<Integer> head ;
    //初始化一个 SeatManager 对象，它管理从 1 到 n 编号的 n 个座位。所有座位初始都是可预约的。
    public SeatManager(int n) {
        head  = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++){
            head.add(i+1);
        }
    }

    //返回可以预约座位的 最小编号 ，此座位变为不可预约。    
    public int reserve() {
        return head.poll();
    }
    
    // 将给定编号 seatNumber 对应的座位变成可以预约。
    public void unreserve(int seatNumber) {
        head.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */