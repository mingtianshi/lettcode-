import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/zigzag-conversion/
//_6_Z字形变换
public class _6_Z字形变换 {
    class Solution {
        public String convert(String s, int numRows) {

            if (numRows == 1) return s;

            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < Math.min(numRows, s.length()); i++)
                rows.add(new StringBuilder());

            int curRow = 0;
            boolean goingDown = false;

            for (char c : s.toCharArray()) {
                rows.get(curRow).append(c);
                if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
                curRow += goingDown ? 1 : -1;
            }

            StringBuilder ret = new StringBuilder();
            for (StringBuilder row : rows) ret.append(row);
            return ret.toString();
        }
    }
}
/*

作者：LeetCode
链接：https://leetcode-cn.com/problems/zigzag-conversion/solution/z-zi-xing-bian-huan-by-leetcode/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
