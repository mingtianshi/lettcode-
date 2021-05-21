//https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/
//_1738_找出第 K 大的异或坐标值
class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] temp = new int[m + 1][n + 1];

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                temp[i][j]=temp[i-1][j] ^ temp[i][j-1] ^ temp[i-1][j-1] ^ matrix[i-1][j-1];
                queue.offer(temp[i][j]);
            }
        }
        
        for (int i=0;i<k-1;i++){
            queue.poll();
        }
        
        return queue.poll();
    }
}