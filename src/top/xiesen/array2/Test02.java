package top.xiesen.array2;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,78,47};
		Arrays.sort(a);		//使用二分法排序
		System.out.println(Arrays.toString(a));
		//增强for循环
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("该元素的索引号是：" + Arrays.binarySearch(a, 47));
	}
}
