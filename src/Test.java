import java.util.HashMap;
import java.util.Map;

public class Test
{
    public static void main(String[] args)
    {
        Map<Long, Integer> map = new HashMap<>();
        long[] matrix = new long[10000];
        long temp;
        for(int i = 0; i < matrix.length; i++)
        {
            matrix[i] = (long)(Math.random() * 100);//随机生成0-100之间的数，模拟转化后的位向量表示的矩阵
        }
        for(long e: matrix)
        {
            temp = changeToSame(e);//转化
            map.put(e, map.getOrDefault(temp, 0) + 1);//统计次数
        }
        for(Map.Entry<Long, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static long changeToSame(long matrix)//将位向量表示的矩阵转化为统一的同构矩阵，并返回位向量
    {
        return matrix;//此处省略转化过程，只表示整体框架
    }
    public static long transform(int[][] matrix)//将8阶01矩阵转化为位向量
    {
        long result = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                result <<= 1;
                result += matrix[i][j];
            }
        }
        return result;
    }
}
