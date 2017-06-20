package top.xiesen.testwrapperclass;
/**
 * 包装类：将基本数据类型转换成对象
 * @author Allen
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Integer i = new Integer(2000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		System.out.println(i2 + 10);
		
		String str = 234 + "";
		
	}
}
