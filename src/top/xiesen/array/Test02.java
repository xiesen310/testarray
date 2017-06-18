package top.xiesen.array;
/**
 * 数组的基本语法
 * @author Allen
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//声明
		int []a;
		int b[];
		//创建数组对象
		a = new int[4];
		b = new int[5];
		//初始化(对数组元素的初始化)
		//默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样。
		//动态初始化：
		a[0] = 23;
		a[1] = 45;
		for (int i = 0; i < b.length; i++) {
			b[i] = i * 12;
		}
		// 静态初始化
		int c[] = {1,2,3,4,5};
		
		Car[] cars = {new Car("宝马"),new Car("奔驰"),new Car("大众")};
		Car c2 = new Car("宝马");
		System.out.println(c2 == cars[0]);
	}
}
