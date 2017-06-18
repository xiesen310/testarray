package top.xiesen.array;

public class Test01 {

	public static void main(String[] args) {
		/**
		 * 1.数组是相同数据类型的有序集合
		 * 2.数组也是对象。数组元素相当于对象的成员变量
		 * 3.数组长度是确定的，不可变的。如果越界，产生ArrayIndexOutOfBoundsException异常
		 */
		int [] a = new int [3]; 
		a[0] = 22;
		a[1] = 23;
		a[2] = 24;
		
		double [] d = new double[2];
		Car [] cars = new Car[3];
		cars[0] = new Car("奔驰");
		cars[1] = new Car("宝马");
		System.out.println(cars[0].name);
		System.out.println(cars.length);
		for (int  i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
