package top.xiesen.teststring;
/**
 * String:不可变字符序列
 * String的一些常用方法
 * @author Allen
 *
 */
public class TestString {

	public static void main(String[] args) {
		String str  = new String("abcd");
		String str2 = new String("abcd");
		//返回char[index]
		System.out.println(str.charAt(2));
		
		System.out.println(str.equals(str2));//比较内容是否相同
		System.out.println(str == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str4);
		
		System.out.println(str3.indexOf('c'));
		String str5 = str3.replace('b', '*');
		System.out.println(str5);
		System.out.println("---------------------");
		String str6 = "abc,bcd,cde,dfr";
		String[] split = str6.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("---------------------");
		
		String str7 = "  aa  bb   ";
		String str77 = str7.trim(); //trim 取出首尾空格
		System.out.println(str77.length());
		
		System.out.println("Abc".equalsIgnoreCase("abc"));
		
		System.out.println("Abcdebd".indexOf('b'));
		System.out.println("Abcdebd".lastIndexOf('b'));
		
		System.out.println("Abcdebd".startsWith("Ab"));
		System.out.println("Abcdebd".endsWith("bd"));
		
		System.out.println("---------------------");
		
		System.out.println("Abcdebd".toLowerCase());
		System.out.println("Abcdebd".toUpperCase());
		
		System.out.println("---------------------");
		
		String gh = "a";
		for (int i = 0; i < 3; i++) {
			gh += i;
		}
		System.out.println(gh);
	}
	
}
