package top.xiesen.array2;
/**
 * 测试二维数组
 * @author Allen
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4, 0, 9 }, { 5, 6, 7 } };
		
		int[][] b = new int[3][];
		
		b[0] = new int[2];
		b[1] = new int[4];
		b[2] = new int[3];
		
		b[0][0] = 1;
		b[0][1] = 2;
		b[1][0] = 3;
		b[1][1] = 4;
		b[1][2] = 0;
		b[1][3] = 9;
		b[2][0] = 5;
		b[2][1] = 6;
		b[2][2] = 7;
		
		System.out.println(b[2][2]);
	}
}
