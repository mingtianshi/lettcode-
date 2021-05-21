//https://leetcode-cn.com/problems/closest-room/
//_5733_最近的房间
class Solution {
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        int[][] q=new int[queries.length][3];
        for(int i=0;i<q.length;i++){
            q[i][0]=queries[i][0];
            q[i][1]=queries[i][1];
            q[i][2]=i;
        }

        Arrays.sort(q,(x,y) -> y[1]-x[1]);
        Arrays.sort(rooms,(x,y)->y[1]-x[1]);
        
        TreeSet<Integer> set=new TreeSet<>();
        int idx=0;
        int[] ans=new int[q.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<q.length;i++){
            while(idx<rooms.length&&rooms[idx][1]>=q[i][1]){
                set.add(rooms[idx][0]);
                idx+=1;
            }
            Integer a=set.floor(q[i][0]);
            Integer b=set.ceiling(q[i][0]);
            if(a==null&&b==null){
                ans[q[i][2]]=-1;
            }else if(b==null||a==null){
                ans[q[i][2]]=(a==null)?b:a;
            }else{
                ans[q[i][2]]=((q[i][0]-a)<=(b-q[i][0]))?a:b;
            }
        }
        return ans;
    }
}