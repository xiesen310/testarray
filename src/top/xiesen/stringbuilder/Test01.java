package top.xiesen.stringbuilder;
/**
 * String：不可变字符序列
 * 测试可变字符序列，StringBuilder(线程不安全,效率高) , StringBuffer(线程安全,效率低)
 * @author Allen
 * 
 */
public class Test01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//字符数组初始化长度为16
		StringBuilder sb1 = new StringBuilder(32);	//字符数组初始化长度为32
		StringBuilder sb2 = new StringBuilder("abcd");	////字符数组初始化长度为32 value[]={'a','b','c','d',\u0000,...\u0000}
		sb2.append("egf");
		sb2.append(true).append(321).append("随便"); //通过return this 实现方法链
		System.out.println(sb2);
	}
}
