package top.xiesen.array2;
/**
 * 直接打印args[]数组中的值
 * @author Allen
 *
 */
public class Test03 {
	/**
	 * 打印args[]中的值首先需要给数组传递参数，使用eclipse传递参数的方法：
	 * 写好程序，直接右键Run As --> Run configurations
	 *  -->在arguement中写入参数，运行即可
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
