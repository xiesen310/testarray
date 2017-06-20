package top.xiesen.testwrapperclass;
/**
 * 测试自动装箱和自动拆箱
 * @author Allen
 *
 */
public class Test02 {

	public static void main(String[] args) {
		/**
		 * jdk5.0 之后
		 * 自动装箱 编译器帮我们改进代码
		 * Integer a = new Integer(1000);
		 */
		Integer a = 1000;	//自动装箱
		
		Integer b = 2000;
		int d = b;	//编译器改进：b.intValue();
		
		/**
		 * 编译器改进：new Integer(1500).intValue();
		 */
		
		int c = new Integer(1500); //自动拆箱
		System.out.println(d);
		
		Integer d1 = 1234;
		Integer d2 = 1234;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		Integer d3 = -129;	//[-128,127]之间的数，仍然当做是基本数据类型处理。
		Integer d4 = -129;	
		
		System.out.println("###################");
		System.out.println(d3 == d4);
		System.out.println(d3.equals(d4));
	}
}
