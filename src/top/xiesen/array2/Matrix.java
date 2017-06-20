package top.xiesen.array2;
/**
 * 封装了矩阵的常用算法
 * @author Allen
 *
 */
public class Matrix {

	/**
	 * 打印输出二维矩阵
	 * @param c
	 */
	public static void print(int[][] c){
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
	/**
	 * 矩阵的加法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][] a,int[][] b){
		int c[][] = new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]  = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int [][]a = {
				{1,3},
				{2,4},
		};
		
		int[][]b = {
				{3,4},
				{5,6}
		};
		
		//计算矩阵的和
		int [][]c = add(a,b);
		
		//打印输出结果
		print(c);
	}
}
