package top.xiesen.stringbuilder;
/**
 * 可变数组
 * 测试StringBuilder的一些常用方法
 * @author Allen
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//StringBuilder 线程不安全 效率高
		StringBuilder sb = new StringBuilder("abcdefghigklmnopqrstuvwxyz");
		sb.delete(3, 5);	//[3,5)
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		//StringBuffer 线程不安全 效率低
		StringBuffer sb2 = new StringBuffer();

	}
}
