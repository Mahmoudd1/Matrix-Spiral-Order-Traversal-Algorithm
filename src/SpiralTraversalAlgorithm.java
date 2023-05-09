import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalAlgorithm {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>mylist=new ArrayList<>();
        int left=0, right=matrix[0].length-1;
        int up=0,down=matrix.length-1;
        int m=matrix.length;
        int n=matrix[0].length;
        while (mylist.size()<m*n)
        {
            for (int i=left;i<=right && mylist.size()<m*n;i++)
            {
                mylist.add(matrix[up][i]);
            }
            for (int j=up+1;j<=down && mylist.size()<m*n;j++)
            {
                mylist.add(matrix[j][right]);
            }
            for (int j=right-1;j>=left && mylist.size()<m*n;j--)
            {
                mylist.add(matrix[down][j]);
            }
            for (int j=down-1;j>up && mylist.size()<m*n;j--)
            {
                mylist.add(matrix[j][left]);
            }
            right--;
            left++;
            up++;
            down--;
        }
        return mylist;

    }
}